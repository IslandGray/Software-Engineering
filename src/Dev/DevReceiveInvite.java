package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.Project2;

public class DevReceiveInvite {
	private String inputAccount;
	private List<Project2> list=new ArrayList<Project2>();
	
	public String receive() throws Exception{
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
		      Statement stmt1 = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select * from rec_data where dev_account='"+inputAccount+"'");
		      while(rs.next()){
		    	  System.out.println("first");
		    	  String projectID=rs.getString("Project_ID");
		    	  String needer=rs.getString("company");
		    	  ResultSet rp = stmt1.executeQuery("select * from Project where ID='"+projectID+"'");
		    	  if(rp.next()){
		    		  System.out.println("second");
		    		  String pjname=rp.getString("Name");
		    		  int pjnum=rp.getInt("Num");
		    		  String education=rp.getString("Education");
		    		  String language=rp.getString("Language");
		    		  String platform=rp.getString("Platform");
		    		  String experience=rp.getString("Experience");
		    		  String status=rp.getString("Status");
		    		  String time=rp.getString("Time");
		    		  String price=rp.getString("Price");
		    		  String[] worker = null;
		    		  int tenderNum;
		    		  try{
			    		  worker = rp.getString("worker").split("&");
			    		  tenderNum=worker.length;
			    	  }catch(Exception e){
			    		  worker = null;
			    		  tenderNum=0;
			    	  }
		    		  Project2 pro=new Project2(pjname, "", pjnum, education, language, platform, experience, time, price, projectID, needer, status,worker,null,tenderNum);
		    		  list.add(pro);
		    		  System.out.println("finish");
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

	public String getInputAccount() {
		return inputAccount;
	}

	public void setInputAccount(String inputAccount) {
		this.inputAccount = inputAccount;
	}

	public List<Project2> getList() {
		return list;
	}

	public void setList(List<Project2> list) {
		this.list = list;
	}

    
}
