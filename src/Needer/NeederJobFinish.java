package Needer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NeederJobFinish {
	private String projectID;
	
	public String finish() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
		    }
		try {
		      Connection connect = DriverManager.getConnection(
		          "jdbc:mysql://localhost:3306/JOB","root","wcp19970221");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();

	    	  stmt.executeUpdate("update History set Status='ȷ�����' where Project='"+projectID+"'");
	    	  //stmt.executeUpdate("insert into History values('"+inputAccount+"','"+inputProjectID+"','�ȴ�ȷ��')");
	    	  stmt.executeUpdate("update Project set Status='�ر�' where ID='"+projectID+"'");
	    	  //stmt.executeUpdate("update Developer set Sex='"+inputSex+"' where Account='"+inputAccount+"'"); 
		} 
		catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		
		return "SUCCESS";
	}

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	
	
}
