package bucketList.database;

import java.sql.*;

public class DatabaseConnection
{
    private static final String DATABASE_NAME = "bucket_list";
    private static final String DATABASE_USERNAME = "bucket_list_user";
    private static final String DATABASE_PASSWORD = "rumpelstiltskin";
    
    private static Connection connection;
    
    public static Connection openConnection()
    {
	if (DatabaseConnection.connection != null) {
	    return DatabaseConnection.connection;
	}
	
	try {
	    Class.forName("com.mysql.jdbc.Driver").newInstance();
	    DatabaseConnection.connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/" + DATABASE_NAME,
		    DATABASE_USERNAME,
		    DATABASE_PASSWORD
		    );
	} catch (Exception e) {
	    //TODO: Add logging
	    System.exit(0);
	}
	return DatabaseConnection.connection;
    }
}
