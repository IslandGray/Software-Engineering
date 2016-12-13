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

public class NeederSelect {
	private String inputEmail;
	private String projectID;
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
	
	public String select() throws Exception{
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
		      ResultSet rs = stmt.executeQuery("select * from Project where ID='"+projectID+"'");
		      if(rs.next()){
		    	  language=rs.getString("Language");
			      platform=rs.getString("Platform");
		    	  String waiterIDtemp=rs.getString("Waiter");
		    	  if(waiterIDtemp==null){
		    		  System.out.println("No Tender!");
		    		  return "SUCCESS";
		    	  }
		    	  try{
		    		  String[] waiterID=waiterIDtemp.split("&");
		    		  for(int i=0;i<waiterID.length;i++){
			    		  rs = stmt.executeQuery("select * from Developer where Account='"+waiterID[i]+"'");
					      if(rs.next()){
					    	  String devname = rs.getString("Name");
					    	  String devgraduate = rs.getString("Graduate");
					    	  String devsex = rs.getString("Sex");
					    	  String devaccount = rs.getString("Account");
					    	  
					    	  //String devlanguage = rs.getString("Language");
					    	  //String devplatform = rs.getString("Platform");
					    	  //String devexperience = rs.getString("Experience");
					    	  //String devprice = rs.getString("Price");
					    	  
					    	  Developer dev=new Developer(devname, devgraduate, devsex, devaccount, null, null, null, null);
					    	  list.add(dev);
					      }
			    	  }
		    	  }catch(Exception e){
		    		  System.out.println("Only one tender");
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

	public List<Developer> getList() {
		return list;
	}

	public void setList(List<Developer> list) {
		this.list = list;
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

}
	
	
