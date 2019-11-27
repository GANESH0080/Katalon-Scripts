package com.PPE

import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import com.kms.katalon.core.annotation.Keyword
import java.sql.Connection

public class Database_Connection {

	private static Connection connection = null;
	
	   /**
		* Open and return a connection to database
		* @param dataFile absolute file path
		* @return an instance of java.sql.Connection
		*/
	   @Keyword
	   def connectDB(String url, String port, String dbname, String username, String password)
	   {
		   
		   //Load driver class for your specific database type
		  String conn = "jdbc:sqlserver://" + url + ":" + port + ";databaseName=" + dbname
		  
		  println conn
		
		   if(connection != null && !connection.isClosed()){
			   connection.close()
		   }
		   connection = DriverManager.getConnection(conn,username,password)
		   return connection
	   }
		
	   /**
		* execute a SQL query on database
		* @param queryString SQL query string
		* @return a reference to returned data collection, an instance of java.sql.ResultSet
		*/
	   @Keyword
	   def executeQuery(String queryString) {
		   Statement stm = connection.createStatement()
		   ResultSet rs = stm.executeQuery(queryString)
		   return rs
	   }
	
	   @Keyword
	   def closeDatabaseConnection() {
		   if(connection != null && !connection.isClosed()){
			   connection.close()
		   }
		   connection = null
	   }
	
	   /**
		* Execute non-query (usually INSERT/UPDATE/DELETE/COUNT/SUM...) on database
		* @param queryString a SQL statement
		* @return single value result of SQL statement
		*/
	   @Keyword
	   def execute(String queryString) {
		   Statement stm = connection.createStatement()
		   boolean result = stm.execute(queryString)
		   return result
	   }
}