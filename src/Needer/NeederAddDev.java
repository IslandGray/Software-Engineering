package Needer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.*;

public class NeederAddDev {
	private String projectID;
	private String devAccount;
	
	private String inputEmail;
	
	public String add() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.println("Error loading Mysql Driver!");
		      e.printStackTrace();
		      return "ERROR";
		    }
		try{
			Connection connect = DriverManager.getConnection(
			          "jdbc:mysql://localhost:3306/JOB","root","wcp19970221");
			      System.out.println("Success connect Mysql server!");
			      Statement stmt = connect.createStatement();
			      ResultSet rs = stmt.executeQuery("select * from Project where ID='"+projectID+"'");
			      if(rs.next()){
			    	  
			    	  String workerTemp=rs.getString("Worker");
			    	  if(workerTemp==null){
			    		  stmt.executeUpdate("update Project set Worker='"+devAccount+"' where ID='"+projectID+"'");
			    		  //stmt.executeUpdate("update Developer set Doing='"+projectID+"' where Account='"+devAccount+"'");
			    		  DeleteAFromBinCwhenD press=new DeleteAFromBinCwhenD(devAccount, "Waiter", "Project", "ID='"+projectID+"'");
			    		  press.calculate();
			    	  }
			    	  else{
			    		  stmt.executeUpdate("update Project set Worker='"+workerTemp+"&"+devAccount+"' where ID='"+projectID+"'");
			    		  DeleteAFromBinCwhenD press=new DeleteAFromBinCwhenD(devAccount, "Waiter", "Project", "ID='"+projectID+"'");
			    		  press.calculate();
			    	  }
			    	  stmt.executeUpdate("update Developer set Doing='"+projectID+"' where Account='"+devAccount+"'");
			    	  rs = stmt.executeQuery("select * from Developer where Account='"+devAccount+"'");
			    	  if(rs.next()){
			    		  DeleteAFromBinCwhenD press=new DeleteAFromBinCwhenD(projectID, "Tender", "Developer", "Account='"+devAccount+"'");
			    		  press.calculate();
			    		  String tenderTemp=rs.getString("Tender");
			    		  try{
			    			  String[] tender=tenderTemp.split("&");
			    			  for(int i=0;i<tender.length;i++){
			    				  DeleteAFromBinCwhenD p=new DeleteAFromBinCwhenD(devAccount, "Waiter", "Project", "ID='"+tender[i]+"'");
					    		  press.calculate();
			    			  }
			    		  }catch(Exception e){
			    			  DeleteAFromBinCwhenD p=new DeleteAFromBinCwhenD(devAccount, "Waiter", "Project", "ID='"+tenderTemp+"'");
				    		  press.calculate();
				    		  e.printStackTrace();
			    		  }
			    	  }
			    	  
			    	  rs = stmt.executeQuery("select * from Project where ID='"+projectID+"'");
			    	  if(rs.next()){
			    		  int NeedNum=rs.getInt("num");
			    		  workerTemp=rs.getString("Worker");
				    	  int currentNum;
				    	  try{
				    		  String[] Worker=workerTemp.split("&");
				    		  currentNum=Worker.length;
				    	  }catch(Exception e){
				    		  currentNum=0;
				    		  e.printStackTrace();
				    	  }
				    	  if(currentNum>=NeedNum){
				    		  stmt.executeUpdate("update Project set Status='正在进行' where ID='"+projectID+"'");
				    	  }
				    	  
			    	  }
			    	  
			      }
			      
		}catch(Exception e){
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

	public String getDevAccount() {
		return devAccount;
	}

	public void setDevAccount(String devAccount) {
		this.devAccount = devAccount;
	}

	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}

		
}
