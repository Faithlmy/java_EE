package com.jdbc;

//import java.sql.Connection;
import java.sql.*;

import javax.sql.DataSource;

public class JdbcCustomer implements CustomerDAO {
	
	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO CUSTOMER" + "(c_id, c_age, c_name) VALUES(?,?,?)";
		Connection conn = null;
		try {
			conn = ds.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getId());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.executeUpdate();
			ps.close();
		}catch (Exception e){
			throw new RuntimeException(e);
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {};
			}
		}
	}

	public Customer findByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM CUSTOMER WHERE Id = ?";
		Connection conn = null;
		try {
			conn = ds.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customerId);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				customer = new Customer(
						rs.getInt("Id"), 
						rs.getString("Name"),
						rs.getInt("Age")
						);
			}
			rs.close();
			ps.close();
			return null;
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {};
			}
		}
	}
}
