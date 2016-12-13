package Needer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NeederJobFinish {
	private String projectID;
	private String inputEmail;
	
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
		      
		      ResultSet rs = stmt.executeQuery("select * from Project where ID='"+projectID+"'");
		      if(rs.next()){
		    	  int num=rs.getInt("Num");
		    	  rs = stmt.executeQuery("select * from History where Project='"+projectID+"'");
		    	  if(rs.next()){
		    		  String devtemp= rs.getString("Developer");
		    		  try{
		    			  String dev[]=devtemp.split("&");
		    			  if(dev.length!=num){
		    				  return "ERROR";
		    			  }
		    			  else{
		    				  stmt.executeUpdate("update History set Status='ȷ�����' where Project='"+projectID+"'");
		    				  stmt.executeUpdate("update Project set Status='�ر�' where ID='"+projectID+"'");
		    				  return "SUCCESS";
		    			  }
		    		  }catch (Exception e) {
		    			  System.out.print("split error!");
		    		      e.printStackTrace();
		    		      return "ERROR";
		    		  }
		    	  }
		    	  else{
		    		  return "ERROR";
		    	  }
		      }
		      
	    	  //stmt.executeUpdate("insert into History values('"+inputAccount+"','"+inputProjectID+"','�ȴ�ȷ��')");
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

	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}
	
	
}
