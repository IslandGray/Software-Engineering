package Needer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.History;

public class NeederHistory {
	private List<History> list=new ArrayList<History>();
	private String inputEmail;
	
	public String history() throws Exception{
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
			      String projectIDtemp=rs.getString("Project"); 
			      if(projectIDtemp==null){
		    		  System.out.println("No Project!");
		    		  return "SUCCESS";
		    	  }
		      
			      try{
			    	  String[] projectID=projectIDtemp.split("&");
		    		  for(int i=0;i<projectID.length;i++){
		    			  rs = stmt.executeQuery("select * from History where Project='"+projectID[i]+"'");
		    			  if(rs.next()){
			    			  String status = rs.getString("Status");
					    	  String inputAccount = rs.getString("Developer");
					    	  History pro=new History(inputAccount,projectID[i],status);
					    	  list.add(pro);
		    			  }
		    		  }
			      }catch(Exception e){
		    		  System.out.println("Only one project");
		    		  rs = stmt.executeQuery("select * from History where Project='"+projectIDtemp+"'");
		    		  if(rs.next()){
		    			  String status = rs.getString("Status");
				    	  String inputAccount = rs.getString("Developer");
				    	  History pro=new History(inputAccount,projectIDtemp,status);
				    	  list.add(pro);
		    		  }
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

	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}
	
}
