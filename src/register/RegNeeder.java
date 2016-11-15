package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegNeeder {
	private String inputCompany;
	private String inputLocation;
	private String inputAttention;
	private String inputNumber;
	private String inputAccount;
	private String inputEmail;
	private String inputPassword;
	
	public String register() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //¼ÓÔØMYSQL JDBCÇý¶¯³ÌÐò   
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
		      ResultSet rs = stmt.executeQuery("select * from Needer where Company='"+inputCompany+"' or Email='"+inputEmail+"'");
		      if(rs.next()){
		    	  System.out.print("Already Registed!");
		    	  return "REGISTED";
		      }
		      int num=stmt.executeUpdate("insert into Needer values('"+inputCompany+"','"+inputLocation+"','"+inputAttention+"','"+inputNumber+"','"+inputAccount+"','"+inputEmail+"','"+inputPassword+"',NULL)");
		      if(num>=1)	System.out.print("success add "+num+" records in Table-Needer");
		      else	System.out.print("Add data error!");
		} 
		catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		      return "ERROR";
		    }
		return "SUCCESS";
	}

	public String getInputCompany() {
		return inputCompany;
	}

	public void setInputCompany(String inputCompany) {
		this.inputCompany = inputCompany;
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

	public String getInputAccount() {
		return inputAccount;
	}

	public void setInputAccount(String inputAccount) {
		this.inputAccount = inputAccount;
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
	
	
}
