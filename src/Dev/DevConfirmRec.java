package Dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.DeleteAFromBinCwhenD;
import SQL.Project2;

public class DevConfirmRec {
	private String inputAccount;
	private String projectID;

	private List<Project2> list=new ArrayList<Project2>();
	
	public String confirm() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
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
		      Statement stmt2 = connect.createStatement();
		      ResultSet rx = stmt2.executeQuery("select * from Project where ID='"+projectID+"'");
		      String workerTemp=null;
		      if(rx.next()){
		    	  workerTemp=rx.getString("Worker");
		    	  System.out.println("1");
		    	  if(workerTemp==null){
		    		  System.out.println("2.1");
		    		  stmt2.executeUpdate("update Project set Worker='"+inputAccount+"' where ID='"+projectID+"'");
		    		  stmt2.executeUpdate("delete from rec_data where Project_ID='"+projectID+"'and dev_account='"+inputAccount+"'");
		    	  }
		    	  else{
		    		  System.out.println("2.2");
		    		  stmt2.executeUpdate("update Project set Worker='"+workerTemp+"&"+inputAccount+"' where ID='"+projectID+"'");
		    		  stmt2.executeUpdate("delete from rec_data where Project_ID='"+projectID+"'and dev_account='"+inputAccount+"'");
		    	  }
		      }
		      rx.close();
		      stmt2.close();
		      ResultSet rs = stmt.executeQuery("select * from rec_data where dev_account='"+inputAccount+"'");
		      while(rs.next()){
		    	  System.out.println("first");
		    	  projectID=rs.getString("Project_ID");
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
		    		  int tenderNum;
		    		  String[] worker = null;
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
		      rs = stmt.executeQuery("select * from Developer where Account='"+inputAccount+"'");
		      if(rs.next()){
		    	  stmt.executeUpdate("update Developer set Doing='"+projectID+"' where Account='"+inputAccount+"'");
		      }
		      rs = stmt.executeQuery("select * from Project where ID='"+projectID+"'");
	    	  if(rs.next()){
	    		  int NeedNum=rs.getInt("num");
	    		  workerTemp=rs.getString("Worker");
		    	  int currentNum;
		    	  try{
		    		  String[] Worker=workerTemp.split("&");
		    		  currentNum=Worker.length;
		    	  }catch(Exception e){
		    		  currentNum=0;
		    		  e.printStackTrace();
		    	  }
		    	  if(currentNum>=NeedNum){
		    		  stmt.executeUpdate("update Project set Status='正在进行' where ID='"+projectID+"'");
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

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
}
