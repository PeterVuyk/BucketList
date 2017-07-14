package bucketList.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bucketList.repository.ActivityRepository;

@SuppressWarnings("serial")
@WebServlet(description = "Add an activity to the bucket list", urlPatterns = {"/ajax/update"})
public class UpdateActivity extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
	Integer activityId = Integer.parseInt(request.getParameter("activity_id"));
	Boolean isDone = Boolean.valueOf(request.getParameter("is_done"));
	ActivityRepository activityRepository = new ActivityRepository();

	try {
	    //TODO: Validate values before passing it to the repository.
	    activityRepository.updateActivity(activityId, isDone);
	} catch (Exception e) {
	    //TODO: Return error message to the browser
	}
	response.sendRedirect(request.getContextPath());
    }
}
