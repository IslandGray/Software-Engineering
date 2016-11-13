package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.Project;

public class DevMyTender {
	private List<Project> list=new ArrayList<Project>();
	private String inputAccount;
	
	public String tender() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //¼ÓÔØMYSQL JDBCÇý¶¯³ÌÐò   
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
		      ResultSet rs = stmt.executeQuery("select * from Developer where Account='"+inputAccount+"'");
		      while(rs.next()){
		    	  String projectID=rs.getString("Tender");
		    	  rs = stmt.executeQuery("select * from Project where ID='"+projectID+"'");
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
			      else{
			    	  System.out.println("no such project!");
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

	public String getInputAccount() {
		return inputAccount;
	}

	public void setInputAccount(String inputAccount) {
		this.inputAccount = inputAccount;
	}
	
	
}
