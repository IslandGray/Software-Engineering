package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;

public class RegDeveloper {
	private String inputName;
	private String inputID;
	private String inputGraduate;
	private String inputSexMan;
	private String inputSexWoman;
	private String inputAccount;
	private String inputPassword;
	private String inputSex;
	//private int sex;
	
	
	public String register() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
		    }
		try {
		      Connection connect = DriverManager.getConnection(
		          "jdbc:mysql://localhost:3306/JOB","root","19960822zzc");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select * from Developer where Account='"+inputAccount+"' or ID='"+inputID+"'");
		      if(rs.next()){
		    	  System.out.print("Already Registed!");
		    	  return "REGISTED";
		      }
		      //if (inputSex.equals("男")) sex=0;
		      //else if (inputSex.equals("女")) sex=1;
		      int num=stmt.executeUpdate("insert into Developer values('"+inputName+"','"+inputID+"','"+inputGraduate+"','"+inputSex+"','"+inputAccount+"','"+inputPassword+"',NULL,NULL)");
		      if(num>=1)	System.out.print("success add "+num+" records in Table-Developer");
		      else	System.out.print("Add data error!");
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


	public String getInputID() {
		return inputID;
	}


	public void setInputID(String inputID) {
		this.inputID = inputID;
	}


	public String getInputGraduate() {
		return inputGraduate;
	}


	public void setInputGraduate(String inputGraduate) {
		this.inputGraduate = inputGraduate;
	}


	public String getInputSexMan() {
		return inputSexMan;
	}


	public void setInputSexMan(String inputSexMan) {
		this.inputSexMan = inputSexMan;
	}


	public String getInputSexWoman() {
		return inputSexWoman;
	}


	public void setInputSexWoman(String inputSexWoman) {
		this.inputSexWoman = inputSexWoman;
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


	public String getInputSex() {
		return inputSex;
	}


	public void setInputSex(String inputSex) {
		this.inputSex = inputSex;
	}
	
	
}
