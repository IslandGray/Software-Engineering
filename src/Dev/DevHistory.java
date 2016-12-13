package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.History;
import SQL.Project;

public class DevHistory {
	private List<History> list=new ArrayList<History>();
	private String inputAccount;
	
	public String history() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
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
		      ResultSet rs = stmt.executeQuery("select * from History where Developer='"+inputAccount+"'");
		      while(rs.next()){
		    	  
		    	  try{
		    		  
			    	  String status = rs.getString("Status");
			    	  String project = rs.getString("Project");
			    	  History pro=new History(inputAccount,project,status);
			    	  list.add(pro);
			    	  
			    	  
		    	  }catch(Exception e){
		    		  return "SUCCESS";
		    	  }
		      }
		} 
		catch (Exception e) {
		      System.out.println("get data error!");
		      e.printStackTrace();
		      return "ERROR";
		    }
		
		return "SUCCESS";
	}
	

	public List<History> getList() {
		return list;
	}


	public void setList(List<History> list) {
		this.list = list;
	}


	public String getInputAccount() {
		return inputAccount;
	}

	public void setInputAccount(String inputAccount) {
		this.inputAccount = inputAccount;
	}
	
	
}
