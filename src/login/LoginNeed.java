package login;

import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;

public class LoginNeed extends ActionSupport{
	private String inputAccount;
	private String inputPassword;
	private ArrayList<Map<String,String>> projectlist;
	
	public String login() throws Exception{
		String ccname = "";
		setProjectlist(new ArrayList<Map<String,String>>());
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.println("Error loading Mysql Driver!");
		      e.printStackTrace();
		    }
		try {
		      Connection connect = DriverManager.getConnection(
		          "jdbc:mysql://localhost:3306/JOB","root","19960822zzc");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select * from Needer where Email='"+inputAccount+"' and Password='"+inputPassword+"'");
		      if(rs.next()){
		    	  System.out.println("Match Account Success!");
		    	  ccname=rs.getString("Company");
		    	  ResultSet rs_p = stmt.executeQuery("select * from Project ");
		    	  while(rs_p.next())
		            {
		    		  if(rs_p.getString("Needer").equals(ccname) && rs_p.getString("Status").equals("正在进行")){
		    			    Map<String,String> projectmap = new HashMap();
			                projectmap.put("ID", rs_p.getString("ID"));
			                projectmap.put("Name", rs_p.getString("Needer"));
			                projectmap.put("Language", rs_p.getString("Language"));
			                projectmap.put("Platform", rs_p.getString("Platform"));
			                projectmap.put("Time", rs_p.getString("Time"));
			                projectmap.put("Num", rs_p.getString("Num"));
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

	public String getInputAccount() {
		return inputAccount;
	}

	public void setInputAccount(String inputAccount) {
		this.inputAccount = inputAccount;
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
