package bucketList.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bucketList.database.DatabaseConnection;
import bucketList.entity.Activity;

public class ActivityRepository
{
    public void updateActivity(Integer activityId, boolean isDone) throws SQLException
    {
	PreparedStatement updateActivity = null;
	String sql = "UPDATE activity SET `done` = (?) WHERE id=(?);";
	int done = (isDone == true) ? 1 : 0;
	
	try {
	    updateActivity = DatabaseConnection.openConnection().prepareStatement(sql);
	    updateActivity.setInt(1, done);
	    updateActivity.setInt(2, activityId);
	    updateActivity.executeUpdate();
	} catch(Exception e) {
	    //TODO: Add logging
	}finally {
	    if (updateActivity != null) {
		updateActivity.close();
	    }
	}
    }

    public void addActivity(String activityItem) throws SQLException
    {
	PreparedStatement addActivity = null;
	String sql = "INSERT INTO `activity` (`activity_item`) VALUES (?);";
	
	try {
	    addActivity = DatabaseConnection.openConnection().prepareStatement(sql);
	    addActivity.setString(1, activityItem);	
	    addActivity.executeUpdate();	    
	} catch(Exception e) {
	    //TODO: Add logging
	}finally {
	    if (addActivity != null) {
		addActivity.close();
	    }
	}
    }

    public List<Activity> getAllActivities()
    {
	String sql = "SELECT * FROM `activity` ORDER BY id ASC;";

	List<Activity> activities = new ArrayList<Activity>();
	try {
	    Statement statement = DatabaseConnection.openConnection().createStatement();
	    ResultSet result = statement.executeQuery(sql);

	    while (result.next()) {
		int id = result.getInt("id");
		String activityItem = result.getString("activity_item");
		boolean done = (result.getInt("done") == 1) ? true : false;

		Activity activity = new Activity(id, activityItem, done);

		activities.add(activity);
	    }
	} catch (Exception e) {
	    //TODO: Add logging
	}
	
	return activities;
    }
}
