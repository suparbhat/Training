package com.sapient.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class WatchData {
	
	
	public	String name,price,source;
	
	
	public void setVariables(String watchname)
	{    Connection con = null;
		 Context ctx = null;
		 DataSource ds = null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		try {
		 ctx=new InitialContext();
			 ds = (DataSource)ctx.lookup("java:comp/env/jdbc/watchDB");
			
			 con =ds.getConnection();
				 ps= con.prepareStatement("SELECT PRICE,IMAGESOURCE FROM PRODUCTS WHERE NAME = ?");
			ps.setString(1, watchname);
			//ps.setString(2, password);
			 rs = ps.executeQuery();
			 name=watchname;
			
			if(rs.next()){
				price=rs.getString(1);
				source=rs.getString(2);
				//return true;
			}
			//return false;
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
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = null;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = null;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = null;
	}
	}

