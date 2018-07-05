package cn.edu.scau.cmi.zhouxudong.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public  class DBUtil {
	private static Connection conn = null;  
    private static PreparedStatement ps = null;  
    private static ResultSet rs = null; 
    
	public static void main(String[] args) {
	

        conn = DBConn.conn();       //调用 DBconnection 类的 conn() 方法连接数据库  
        String sql = "select * from student ";       //sql语句  
        try {
			Statement stmt =(Statement) conn.createStatement();
		   ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()) {
        	  
        		 String StuID=rs.getString(1);
        		 String Name=rs.getString(2);
        		String Sex=rs.getString(3);
        		String Grade=rs.getString(4);
        		
        	String Academy=rs.getString(5);
        	
        	System.out.println(StuID+"  "+Name+"  "+Sex+"  "+Grade+"  "+Academy);
           }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
       
        
            DBConn.close();  
        }  
} 
	

