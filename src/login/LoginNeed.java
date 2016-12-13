package login;

import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;

public class LoginNeed extends ActionSupport{
	private String inputEmail;
	private String inputPassword;
	private ArrayList<Map<String,String>> projectlist;
	
	public String login() throws Exception{
		String ccname = "";
		setProjectlist(new ArrayList<Map<String,String>>());
		try {
		      Class.forName("com.mysql.jdbc.Driver");     
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.println("Error loading Mysql Driver!");
		      e.printStackTrace();
		    }
		try {
		      Connection connect = DriverManager.getConnection(
		          "jdbc:mysql://localhost:3306/JOB","root","wcp19970221");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select * from Needer where Email='"+inputEmail+"' and Password='"+inputPassword+"'");
		      if(rs.next()){
		    	  System.out.println("Match EmailAccount Success!");
		    	  ccname=rs.getString("Company");
		    	  ResultSet rs_p = stmt.executeQuery("select * from Project where Status='招标中' or Status='正在进行'");
		    	  while(rs_p.next())
		            {
		    		  if(rs_p.getString("Needer").equals(ccname)){
		    			    Map<String,String> projectmap = new HashMap();
			                projectmap.put("ID", rs_p.getString("ID"));
			                projectmap.put("Name", rs_p.getString("Name"));
			                projectmap.put("Language", rs_p.getString("Language"));
			                projectmap.put("Platform", rs_p.getString("Platform"));
			                projectmap.put("Time", rs_p.getString("Time"));
			                projectmap.put("Num", rs_p.getString("Num"));
			                projectmap.put("Status", rs_p.getString("Status"));
			                getProjectlist().add(projectmap);
		    		  }
		            }
		    	  return "SUCCESS";
		      }
		      else{
		    	  System.out.println("Login Failed");
		    	  return "FAILED";
		      }
		} 
		catch (Exception e) {
		      System.out.println("get data error!");
		      e.printStackTrace();
		    }
		
		return "SUCCESS";
	}


	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}

	public String getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(String inputPassword) {
		this.inputPassword = inputPassword;
	}
	
	public ArrayList<Map<String,String>> getProjectlist() {
		return projectlist;
	}
	public void setProjectlist(ArrayList<Map<String,String>> projectlist) {
		this.projectlist = projectlist;
	}
}
