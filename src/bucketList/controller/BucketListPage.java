package bucketList.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bucketList.entity.Activity;
import bucketList.repository.ActivityRepository;

@SuppressWarnings("serial")
@WebServlet(description = "Get a list of activities", urlPatterns = {""})
public class BucketListPage extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
	
	try {
	    ActivityRepository activityRepository = new ActivityRepository();
	    request.setAttribute("activityList", activityRepository.getAllActivities());
	} catch (Exception e) {
	    //TODO: Return error message to the browser
	    request.setAttribute("activityList", new ArrayList<Activity>());
	}
        request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);
    }
}
