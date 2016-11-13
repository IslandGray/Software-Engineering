package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.Project;

public class DevToMarket {
	private List<Project> list=new ArrayList<Project>();
	private String inputAccount;
	
	public String doing() throws Exception{
		
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
		      ResultSet rs = stmt.executeQuery("select * from Project where Status='招标中'");
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
