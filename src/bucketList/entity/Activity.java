package bucketList.entity;

public class Activity
{    
    private int id;
    
    private String activityItem;
    
    private boolean done;
    
    public Activity(int id, String activityItem, boolean done)
    {
	this.id = id;
	this.activityItem = activityItem;
	this.done = done;
    }
    
    public int getId()
    {
	return id;
    }
    
    public String getActivityItem()
    {
	return activityItem;
    }
    
    public boolean getDone()
    {
	return done;
    }
}
