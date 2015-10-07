package com.sapient.model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class User implements Serializable {
	
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean validateLogin(String email, String password)
	{    Connection con = null;
		 Context ctx = null;
		 DataSource ds = null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		try {
		 ctx=new InitialContext();
			 ds = (DataSource)ctx.lookup("java:comp/env/jdbc/watchDB");
			
			 con =ds.getConnection();
				 ps= con.prepareStatement("SELECT FIRST_NAME FROM USERS WHERE EMAIL_ID=? AND PASSWORD = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			 rs = ps.executeQuery();
			
			if(rs.next()){
				email=rs.getString(1);
				return true;
			}
			return false;
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(ctx != null)
				{
					ctx.close();
				}
				if(con != null)
				{
					con.close();
				}
				if(ps != null)
				{
					ps.close();
				}
				if(rs != null)
				{
					rs.close();
				}
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return false;
	}

	

}
