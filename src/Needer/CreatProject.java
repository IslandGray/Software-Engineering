package Needer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreatProject {
	private String inputName;
	private String inputSummary;
	private String inputNum;
	private String inputLanguage;
	private String inputPlatform;
	private String inputEducation;
	private String inputExperience;
	private String inputTime;
	private String inputPrice;
	
	private String inputEmail;
	
	public String creat() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
		      return "ERROR";
		    }
		try {
		      Connection connect = DriverManager.getConnection(
		          "jdbc:mysql://localhost:3306/JOB","root","wcp19970221");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select count(*) from Project");
		      Integer num = null;
		      if(rs.next()){
		    	  num=rs.getInt("count(*)");
		      }
		      num=num+1;
		      String ID=num.toString();
		      rs = stmt.executeQuery("select * from Needer where Email='"+inputEmail+"'");
		      String project=null;
		      String Company=null;
		      if(rs.next()){
		    	  Company=rs.getString("Company");
		    	  project=rs.getString("Project");
		      }
		      num=stmt.executeUpdate("insert into project values('"+inputName+"','"+inputSummary+"','"+inputNum+"','"+inputEducation+"','"+inputLanguage+"','"+inputPlatform+"','"+inputExperience+"','"+inputTime+"','"+inputPrice+"','"+ID+"','"+Company+"','招标中',NULL,NULL)");
		      
		      if(project!=null){
		    	  stmt.executeUpdate("update Needer set Project='"+project+"&"+ID+"' where Email='"+inputEmail+"'");
		      }
		      else{
		    	  stmt.executeUpdate("update Needer set Project='"+ID+"' where Email='"+inputEmail+"'");
		      }
		      rs.close();
		} 
		catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		      return "ERROR";
		    }
		return "SUCCESS";
	}

	public String getInputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	public String getInputSummary() {
		return inputSummary;
	}

	public void setInputSummary(String inputSummary) {
		this.inputSummary = inputSummary;
	}

	public String getInputNum() {
		return inputNum;
	}

	public void setInputNum(String inputNum) {
		this.inputNum = inputNum;
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

	public String getInputEducation() {
		return inputEducation;
	}

	public void setInputEducation(String inputEducation) {
		this.inputEducation = inputEducation;
	}

	public String getInputExperience() {
		return inputExperience;
	}

	public void setInputExperience(String inputExperience) {
		this.inputExperience = inputExperience;
	}

	public String getInputTime() {
		return inputTime;
	}

	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
	}

	public String getInputPrice() {
		return inputPrice;
	}

	public void setInputPrice(String inputPrice) {
		this.inputPrice = inputPrice;
	}

	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}
	
	
}
