package SQL;

import java.awt.datatransfer.Transferable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeleteAFromBinCwhenD {
	private String A;	//数据
	private String B;	//字段
	private String C;	//表
	private String D;	//条件
	
	
	public DeleteAFromBinCwhenD(String a, String b, String c, String d) {
		super();
		A = a;
		B = b;
		C = c;
		D = d;
	}


	public String calculate(){
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
		          "jdbc:mysql://localhost:3306/JOB","root","wcp19970221");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select * from "+C+" where "+D);
		      if(rs.next()){
		    	  String tableTemp=rs.getString(B);
		    	  if(tableTemp==null){
		    		  return "NO STRING";
		    	  }
		    	  else{
		    		  try{
		    			  String[] table=tableTemp.split("&");
			    		  for(int i=0;i<table.length;i++){
			    			  if(A.equals(table[i])){
			    				  table[i]="";
			    			  }
			    		  }
			    		  String tableFix=table[0];
			    		  for(int i=1;i<table.length;i++){
			    			  if(table[i]==""){
			    				  continue;
			    			  }
			    			  tableFix=tableFix+"&"+table[i];
			    		  }
			    		  if(tableFix==""){
			    			  tableFix="NULL";
			    			  stmt.executeUpdate("update "+C+" set "+B+"=NULL where "+D);
			    			  return "EMPTY";
			    		  }
			    		  else if(tableFix.charAt(0)=='&'){
			    			  tableFix=tableFix.substring(1,tableFix.length());
			    		  }
			    		  
			    		  stmt.executeUpdate("update "+C+" set "+B+"='"+tableFix+"' where "+D);
		    		  }catch(Exception e){
		    			  e.printStackTrace();
		    		  }
		    		  
		    	  }
		    	  //stmt.executeUpdate("update Needer set Location=''");
		      }  
		} 
		catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		return "";
	}
	
}
