package Find;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.History;

public class FindNeeder {
	private String inputCompany;
	
	private String email;
	private String location;
	private String attention;
	private String number;
	private List<History> list=new ArrayList<History>();
	
	public String find() throws Exception{
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
		      ResultSet rs = stmt.executeQuery("select * from Needer where Company='"+inputCompany+"'");
		      if(rs.next()){
		    	  email=rs.getString("Email");
		    	  location=rs.getString("Location");
		    	  attention=rs.getString("Attention");
		    	  number=rs.getString("Number");
		    	  
		    	  System.out.println("Find Needer Success!");
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
		    	  
		    	  return "SUCCESS";
		      }
		} 
		catch (Exception e) {
		      System.out.println("get data error!");
		      e.printStackTrace();
		    }
		
		return "SUCCESS";
	}
	
	public String getInputCompany() {
		return inputCompany;
	}

	public void setInputCompany(String inputCompany) {
		this.inputCompany = inputCompany;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAttention() {
		return attention;
	}

	public void setAttention(String attention) {
		this.attention = attention;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<History> getList() {
		return list;
	}

	public void setList(List<History> list) {
		this.list = list;
	}
	
}
