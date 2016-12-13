package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DevExPre {
	private String inputAccount;
	
	private String inputLanguage;
	private String inputPlatform;
	private String inputExperience;
	
	public String edit() throws Exception{
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
		      ResultSet rs = stmt.executeQuery("select * from dev_data where Account='"+inputAccount+"'");
		      if(rs.next()){
		    	  inputLanguage = rs.getString("language");
		    	  inputPlatform = rs.getString("platform");
		    	  inputExperience = rs.getString("experience");
		    	  //inputSex = rs.getString("Sex");
		      }
		} 
		catch (Exception e) {
		      System.out.println("get data error!");
		      e.printStackTrace();
		      return "ERROR";
		    }
		return "SUCCESS";
	}

	public String getInputAccount() {
		return inputAccount;
	}

	public void setInputAccount(String inputAccount) {
		this.inputAccount = inputAccount;
	}

	public String getInputLanguage() {
		return inputLanguage;
	}

	public void setInputLanguage(String inputLanguage) {
		this.inputLanguage = inputLanguage;
	}

	public String getInputPlatform() {
		return inputPlatform;
	}

	public void setInputPlatform(String inputPlatform) {
		this.inputPlatform = inputPlatform;
	}

	public String getInputExperience() {
		return inputExperience;
	}

	public void setInputExperience(String inputExperience) {
		this.inputExperience = inputExperience;
	}
	
	
}
