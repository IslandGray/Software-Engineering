package Needer;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import SQL.Developer;
import SQL.Project2;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class NeederInviteDev {
	private String inputEmail;
	private String devAccount;
	private String projectID;
	private String Needer;
	private List<Developer> list = new ArrayList<Developer>();
	
	private String name;
	private String language;
	private String platform;
	private String education;
	private String experience;
	private String time;
	private String num;
	private String tendernum;
	private String price;
	// stmt.executeUpdate("insert into rec_data values('"+devAccount+"','"+Needer+"','"+projectID+"')");
	public String invite() throws Exception{
		String workerTemp=null;
		String[] Worker=null;
		int i=0,j=0;
		int length;
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
		      Statement stmt2 = connect.createStatement();
		      Statement stmt3 = connect.createStatement();
		      stmt.executeUpdate("insert into rec_data values('"+devAccount+"','"+Needer+"','"+projectID+"')");
		      ResultSet rs = stmt.executeQuery("select * from Developer ");
		      System.out.println(language+projectID);
		      try{
		    	  ResultSet rp = stmt3.executeQuery("select * from Project where ID='"+projectID+"'");
		    	  if(rp.next()){
		    		  language=rp.getString("Language");
				      platform=rp.getString("Platform");
				      experience=rp.getString("Experience");
				      name=rp.getString("Name");
				      price=rp.getString("Price");
				      workerTemp=rp.getString("Worker");
				      if(workerTemp!=null)
				         Worker=workerTemp.split("&");
		    	  }
		    	  while(rs.next()){
			    	  String devname = rs.getString("Name");
			    	  String devgraduate = rs.getString("Graduate");
			    	  String devsex = rs.getString("Sex");
			    	  String devaccount = rs.getString("Account");
			    	  System.out.println(devaccount);
			    	  j=0;
			    	  if(Worker==null)
			    		  length=0;
			    	  else
			    		  length=Worker.length;
			    	  for(i=0;i<=length-1;i++){
			    		  if(devaccount.equals(Worker[i]))
			    			  break;
			    		  j++;
			    	  }
			    	  if(j==length){
			    		  ResultSet rx = stmt1.executeQuery("select * from dev_data where account='"+devaccount+"'");
				    	  try{
				    		  if(rx.next()){
				    			  String devplatform=rx.getString("platform");
					    		  String devexperience=rx.getString("experience");
					    		  String devlanguage=rx.getString("language");
					    		  System.out.println(devplatform+devlanguage+devexperience);
					    		  System.out.println(platform+language+experience);
				    		      if(devplatform.equals(platform)&&devlanguage.equals(language)&&(Integer.valueOf(devexperience)>=Integer.valueOf(experience))){
				    			     ResultSet rss = stmt2.executeQuery("select * from rec_data where dev_account='"+devaccount+"' and Project_ID='"+projectID+"'");
				    			     if(!rss.next()){
				    				   Developer dev=new Developer(devname, devgraduate, devsex, devaccount, devlanguage, devplatform, devexperience, null);
				    				   list.add(dev);
				    			     }
				    		     }
				    	    }
				    	  }catch (Exception e) {
						      continue;
						    }
			    	  }
			    	  
			      }
		      }catch (Exception e) {
			      System.out.println("only one");
			      return "SUCCESS";
			    }
		      
		} 
		catch (Exception e) {
		      System.out.println("get data error!");
		      e.printStackTrace();
		      return "ERROR";
		    }
		return "SUCCESS";
	}

	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTendernum() {
		return tendernum;
	}

	public void setTendernum(String tendernum) {
		this.tendernum = tendernum;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNeeder() {
		return Needer;
	}

	public void setNeeder(String needer) {
		Needer = needer;
	}
	
	public String getDevAccount() {
		return devAccount;
	}

	public void setDevAccount(String devAccount) {
		this.devAccount = devAccount;
	}

	public List<Developer> getList() {
		return list;
	}

	public void setList(List<Developer> list) {
		this.list = list;
	}
	
	
}
