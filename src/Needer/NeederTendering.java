package Needer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.Project2;

public class NeederTendering {
	private String inputEmail;
	private int tenderNum;
	private List<Project2> list=new ArrayList<Project2>();
	
	public String tendering() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.println("Error loading Mysql Driver!");
		      e.printStackTrace();
		      return "ERROR";
		    }
		try {
		      Connection connect = DriverManager.getConnection(
		          "jdbc:mysql://localhost:3306/JOB","root","wcp19970221");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select * from Needer where Email='"+inputEmail+"'");
		      if(rs.next()){
		    	  String projectIDtemp=rs.getString("Project");
		    	  if(projectIDtemp==null){
		    		  System.out.println("No Project!");
		    		  return "SUCCESS";
		    	  }
		    	  try{
		    		  String[] projectID=projectIDtemp.split("&");
		    		  for(int i=0;i<projectID.length;i++){
			    		  rs = stmt.executeQuery("select * from Project where ID='"+projectID[i]+"'");
					      while(rs.next() & rs.getString("Status").equals("�б���")){
					    	  String id=rs.getString("ID");
					    	  String name = rs.getString("Name");
					    	  String company = rs.getString("Needer");
					    	  int num = rs.getInt("Num");
					    	  String language = rs.getString("Language");
					    	  String platform = rs.getString("Platform");
					    	  String  time = rs.getString("Time");
					    	  String price = rs.getString("Price");
					    	  String status = rs.getString("Status");
					    	  String experience = rs.getString("Experience");
					    	  String education = rs.getString("Education");
					    	  String[] worker = null;
					    	  String[] waiter = null;
					    	  try{
					    		  worker = rs.getString("worker").split("&");
					    	  }catch(Exception e){
					    		  worker = null;
					    	  }
					    	  try{
					    		  waiter = rs.getString("waiter").split("&");
					    		  tenderNum=waiter.length;
					    	  }catch(Exception e){
					    		  waiter = null;
					    		  tenderNum=0;
					    	  }
					    	  
					    	  Project2 pro=new Project2(name, "", num, education, language, platform, experience, time, price, id, company, status,worker,waiter);
					    	  list.add(pro);
					      }
			    	  }
		    	  }catch(Exception e){
		    		  System.out.println("Only one project or End");
		    		  return "SUCCESS";
		    	  }
		      }
		} 
		catch (Exception e) {
		      System.out.println("get data error!");
		      e.printStackTrace();
		      return "ERROR";
		    }
		return "SUCCESS";
	}

	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}

	public List<Project2> getList() {
		return list;
	}

	public void setList(List<Project2> list) {
		this.list = list;
	}

	public int getTenderNum() {
		return tenderNum;
	}

	public void setTenderNum(int tenderNum) {
		this.tenderNum = tenderNum;
	}
	
	
}
