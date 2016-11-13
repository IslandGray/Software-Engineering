package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DevTender {
	private String itemID;
	private String inputAccount;
	
	public String tender() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //¼ÓÔØMYSQL JDBCÇý¶¯³ÌÐò   
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
		      ResultSet rs = stmt.executeQuery("select * from Project where ID='"+itemID+"'");
		      if(rs.next()){
		    	  String exist = rs.getString("Waiter");
		    	  if(exist!=null){
		    		  int num=stmt.executeUpdate("update Project set Waiter='"+exist+"&"+inputAccount+"' where ID='"+itemID+"'");
				      if(num>=1)	System.out.print("success add "+num+" waiter in Table-project");
				      else	System.out.print("Add data error!");
		    	  }
		    	  else{
		    		  int num=stmt.executeUpdate("update Project set Waiter='"+inputAccount+"' where ID='"+itemID+"'");
				      if(num>=1)	System.out.print("success add "+num+" waiter in Table-project");
				      else	System.out.print("Add data error!");
		    	  }
			 } 
		      else{
		    	  return "ERROR";
		      }
		      return "SUCCESS";
		} 
		catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		
		return "SUCCESS";
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getInputAccount() {
		return inputAccount;
	}

	public void setInputAccount(String inputAccount) {
		this.inputAccount = inputAccount;
	}

	
	
}
