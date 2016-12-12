package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.print.attribute.standard.RequestingUserName;

import com.sun.org.apache.regexp.internal.recompile;

public class DevAccount {
	private String inputAccount;
	private String inputOldPassword;
	private String inputNewPassword;
	private String inputNew2;
	
	public String edit() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //¼ÓÔØMYSQL JDBCÇý¶¯³ÌÐò   
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
		    }
		try {
		      Connection connect = DriverManager.getConnection(
		          "jdbc:mysql://localhost:3306/JOB","root","wcp19970221");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select * from Developer where Account='"+inputAccount+"'");
		      if(rs.next()){
		    	  if(!(inputNewPassword.equals(inputNew2))){
		    		  System.out.println("new password not same:"+inputNewPassword+"||"+inputNew2);
		    		  return "FAILURE";
		    	  }
		    	  if(!(rs.getString("Password").equals(inputOldPassword))){
		    		  System.out.println("Wrong oldpassword");
		    		  return "FAILURE";
		    	  }
		    	  
		    	  stmt.executeUpdate("update Developer set Password='"+inputNewPassword+"' where Account='"+inputAccount+"'");
		    	  //stmt.executeUpdate("update Developer set Sex='"+inputSex+"' where Account='"+inputAccount+"'");
		      }  
		} 
		catch (Exception e) {
		      System.out.print("get data error!");
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

	public String getInputOldPassword() {
		return inputOldPassword;
	}

	public void setInputOldPassword(String inputOldPassword) {
		this.inputOldPassword = inputOldPassword;
	}

	public String getInputNewPassword() {
		return inputNewPassword;
	}

	public void setInputNewPassword(String inputNewPassword) {
		this.inputNewPassword = inputNewPassword;
	}

	public String getInputNew2() {
		return inputNew2;
	}

	public void setInputNew2(String inputNew2) {
		this.inputNew2 = inputNew2;
	}
	
	
}
