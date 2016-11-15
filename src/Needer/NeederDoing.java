package Needer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.Project;

public class NeederDoing {
	private List<Project> list=new ArrayList<Project>();
	private String inputEmail;
	
	public String doing() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
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
		    		  System.out.println("No project!");
		    		  return "SUCCESS";
		    	  }
		    	  try{
		    		  String[] projectID=projectIDtemp.split("&");
		    		  for(int i=0;i<projectID.length;i++){
			    		  rs = stmt.executeQuery("select * from Project where ID='"+projectID[i]+"' and Status='"+"正在进行"+"'");
					      if(rs.next()){
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
					    	  
					    	  Project pro=new Project(name, "", num, education, language, platform, experience, time, price, id, company, status);
					    	  list.add(pro);
					      }
			    	  }
		    	  }catch(Exception e){
		    		  System.out.println("Only one tender");
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

	public List<Project> getList() {
		return list;
	}

	public void setList(List<Project> list) {
		this.list = list;
	}

	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}
	
	
}
