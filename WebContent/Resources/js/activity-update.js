/*jslint browser: true*/

$(document).ready(function() {
    "use strict";
    var checkBox = '.js-checkbox',
    
    _getCheckBoxId = function($locator) {
    	return $($locator).attr('name');
    },
    
    _getCheckBoxValue = function($locator) {
    	return $($locator).is(':checked');
    },
    
    _request = function($locator) {
        $.ajax({
            url: "ajax/update",
            type: "POST",
            data: {
            	activity_id: _getCheckBoxId($locator),
            	is_done: _getCheckBoxValue($locator)
            }
        })
    };

    $(checkBox).click(function(){
    	_request(this);
    });    
});
