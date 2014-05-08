package com.ipr.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.jws.WebService;

@WebService (endpointInterface = "com.ipr.db.IPRConnect")
public class IPRConnectImpl implements IPRConnect{
	private static Connection connection = null;
	private Statement statement = null;
	
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			if(connection == null || connection.isClosed()){
				Properties props = new Properties();
				props.put("user", "root");
				props.put("password", "");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xbpelaccount", props);
			}
			return connection;
		}catch(SQLException | ClassNotFoundException ex){
			ex.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean updateAccount(String query) {
		try{
			statement = getConnection().createStatement();
			int rs = statement.executeUpdate(query);
			if(rs == 0){
				return false;
			}else
				return true;
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		return false;
	}

}
