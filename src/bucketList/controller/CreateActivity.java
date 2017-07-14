package bucketList.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bucketList.repository.ActivityRepository;

@WebServlet(description = "Add an activity to the bucket list", urlPatterns = {"/SaveActivityServlet"})
public class CreateActivity extends HttpServlet
{    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
	String activityItem = request.getParameter("activity-item");
	ActivityRepository activityRepository = new ActivityRepository();
		
	try {
	    //TODO: Validate values before passing it to the repository.
	    activityRepository.addActivity(activityItem);
	} catch (Exception e) {
	    //TODO: Return error message to the browser
	}
	response.sendRedirect(request.getContextPath());
    }
}
