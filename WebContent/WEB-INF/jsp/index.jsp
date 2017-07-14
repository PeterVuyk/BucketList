<%@ include file="header.jsp"%>

<section>
	<h2>Bucket list</h2>
	<p>Check below all the items in the bucket list and mark it down
		once you've done it.</p>

	<c:forEach var="Activity" items="${activityList}">
		<input class="js-checkbox" type="checkbox" name="${Activity.id}"
			<c:if test="${Activity.done == true}">checked="checked"</c:if>>
		<label>${Activity.activityItem}</label>
		<br>
	</c:forEach>
</section>

<%@include file="footer.jsp"%>