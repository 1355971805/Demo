package com.bdqn.dao;


import java.sql.*;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;
/**
 * ������
 * �����ݿ�ķ���
 * @author 123
 */
public class BaseDAO {
	
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/buhui";
	private static final String username = "root";
	private static final String pwd = "";
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException  {
		Class.forName(driver);
		if(con==null||con.isClosed()){
			con=DriverManager.getConnection(url,username,pwd);
		}
		return con;
	}
	
	public ResultSet executeQuery(String sql,Object...obj) throws ClassNotFoundException, SQLException{
		con=getConnection();
		ps=con.prepareStatement(sql);
		for (int i = 0; i < obj.length; i++) {
			ps.setObject(i+1, obj[i]);
		}
		return ps.executeQuery();
		
	}
	
	public int executeUpdate(String sql,Object...obj) throws ClassNotFoundException, SQLException{
		con=getConnection();
		ps=con.prepareStatement(sql);
		for (int i = 0; i < obj.length; i++) {
			ps.setObject(i+1, obj[i]);
		}
		return ps.executeUpdate();
	}
	
	public void closeAll() throws SQLException{
		if(rs!=null){
			rs.close();
		}
		if(ps!=null){
			ps.close();
		}
		if(con!=null){
			con.close();
		}
	}
	
	
	
	
}