package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.valves.rewrite.Substitution.RewriteRuleBackReferenceElement;

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
		          "jdbc:mysql://localhost:3306/JOB","root","wcp19970221");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      
		      ResultSet rs = stmt.executeQuery("select * from Developer where Account='"+inputAccount+"'");
		      if(rs.next()){
		    	  String exist = rs.getString("Doing");
		    	  if(exist!=null){
		    		  
		    		  System.out.print("Exist working!");
		    		  return "EXIST";
		    	  }
		    	  else{
		    		  exist=rs.getString("Tender");
		    		  if(exist!=null){
			    		  String[] tenderID=exist.split("&");
			    		  for(int i=0;i<tenderID.length;i++){
			    			  if(itemID.equals(tenderID[i])){
			    				  return "EXIST";
			    			  }
			    		  }
			    		  int num=stmt.executeUpdate("update Developer set Tender='"+exist+"&"+itemID+"' where Account='"+inputAccount+"'");
					      if(num>=1)	System.out.print("success add "+num+" tender in Table-developer");
					      else	System.out.print("Add data error!");
		    		  }
		    		  else{
		    			  
		    			  int num=stmt.executeUpdate("update Developer set Tender='"+itemID+"' where Account='"+inputAccount+"'");
					      if(num>=1)	System.out.print("success add "+num+" tender in Table-developer");
					      else	System.out.print("Add data error!");   
		    		  }
		    		  
		    		  rs = stmt.executeQuery("select * from Project where ID='"+itemID+"'");
				      if(rs.next()){
				    	  exist = rs.getString("Waiter");
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
