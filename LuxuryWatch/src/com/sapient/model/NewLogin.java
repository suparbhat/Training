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

public class NewLogin implements Serializable {

	private String fname;
	private String lname;
	private String email;
	private String mobile;
	private String password;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validateNewUser(String fname,String lname,String email,String mobile,String password)
	{    Connection con = null;
		 Context ctx = null;
		 DataSource ds = null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		try {
		 ctx=new InitialContext();
			 ds = (DataSource)ctx.lookup("java:comp/env/jdbc/watchDB");
			
			 con =ds.getConnection();
				 ps= con.prepareStatement("INSERT INTO USERS(FIRST_NAME,LAST_NAME,EMAIL_ID,MOBILE_NUMBER,PASSWORD) VALUES (?,?,?,?,?) ");
					ps.setString(1, fname);
					ps.setString(2, lname);
					ps.setString(3, email);
					ps.setString(4, mobile);
					ps.setString(5, password);

					 ps.executeUpdate();
					 return true;
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
