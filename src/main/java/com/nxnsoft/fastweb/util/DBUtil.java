package com.nxnsoft.fastweb.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	

	public void executeScript() throws Exception {

		Connection connection = null;

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userid, password);
			DatabaseMetaData metaData=connection.getMetaData();
			metaData.getColumns(null, null, tableNamePattern, columnNamePattern)
		} catch (ClassNotFoundException e) {
			throw e;
		} catch (SQLException e) {
			throw e;
		} finally {
			closeConnection(connection);
		}
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// ignore
				;
			}
		}
	}

	private void closeStatement(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// ignore
				;
			}
		}
	}

}
