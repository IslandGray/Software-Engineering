package Needer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NeederEditPre {
	private String inputEmail;
	private String inputCompany;
	private String inputAccount;
	private String inputLocation;
	private String inputAttention;
	private String inputNumber;
	
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
		      ResultSet rs = stmt.executeQuery("select * from Needer where Email='"+inputEmail+"'");
		      if(rs.next()){
		    	  inputEmail = rs.getString("Email");
		    	  inputCompany = rs.getString("Company");
		    	  inputAccount = rs.getString("Account");
		    	  inputLocation = rs.getString("Location");
		    	  inputAttention = rs.getString("Attention");
		    	  inputNumber = rs.getString("Number");
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

	public String getInputCompany() {
		return inputCompany;
	}

	public void setInputCompany(String inputCompany) {
		this.inputCompany = inputCompany;
	}

	public String getInputAccount() {
		return inputAccount;
	}

	public void setInputAccount(String inputAccount) {
		this.inputAccount = inputAccount;
	}


	public String getInputLocation() {
		return inputLocation;
	}

	public void setInputLocation(String inputLocation) {
		this.inputLocation = inputLocation;
	}

	public String getInputAttention() {
		return inputAttention;
	}

	public void setInputAttention(String inputAttention) {
		this.inputAttention = inputAttention;
	}

	public String getInputNumber() {
		return inputNumber;
	}

	public void setInputNumber(String inputNumber) {
		this.inputNumber = inputNumber;
	}

	
}
