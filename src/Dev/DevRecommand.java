package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.Project;

public class DevRecommand {
	private List<Project> list=new ArrayList<Project>();
	private String inputAccount;
	
	private String language;
	private String platform;
	
	public String recommand() throws Exception{
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
		          "jdbc:mysql://localhost:3306/JOB","root","wcp19970221");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select * from dev_data where Account='"+inputAccount+"'");
		      if(rs.next()){
		    	  language=rs.getString("language");
		    	  platform=rs.getString("platform");
		      }
		      		      
		      rs = stmt.executeQuery("select * from Project where ( Language='"+language+"' or Platform='" +platform+"' ) and Status='招标中'");
		      //System.out.println("select * from Project where ( Language='"+language+"' or Platform='" +platform+"' ) and Status='招标中'");
		      while(rs.next()){
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
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getPlatform() {
		return platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public List<Project> getList() {
		return list;
	}
	
	public void setList(List<Project> list) {
		this.list = list;
	}
	
	
}
