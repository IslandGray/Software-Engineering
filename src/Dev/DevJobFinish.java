package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DevJobFinish {
	private String inputAccount;
	private String inputProjectID;
	
	public String finish() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
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
		      ResultSet rs = stmt.executeQuery("select * from Developer where Account='"+inputAccount+"'");
		      if(rs.next()){
		    	  
		    	  stmt.executeUpdate("update Developer set Doing=NULL where Account='"+inputAccount+"'");
		    	  stmt.executeUpdate("insert into History values('"+inputAccount+"','"+inputProjectID+"','等待确认')");
		    	  stmt.executeUpdate("update Project set Status='等待确认' where ID='"+inputProjectID+"'");
		    	  //stmt.executeUpdate("update Developer set Sex='"+inputSex+"' where Account='"+inputAccount+"'");
		      }  
		} 
		catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		
		return "SUCCESS";
	}

	public String getInputAccount() {
		return inputAccount;
	}

	public void setInputAccount(String inputAccount) {
		this.inputAccount = inputAccount;
	}

	public String getInputProjectID() {
		return inputProjectID;
	}

	public void setInputProjectID(String inputProjectID) {
		this.inputProjectID = inputProjectID;
	}
	
	
}
