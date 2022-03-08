package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection string
		Connection con = DriverManager.
				         getConnection("jdbc:mysql://localhost:3306/ecommerce", 
				        		 "root", "root");
		
		//Create Statement Object
		Statement stm = con.createStatement();
		
		//insert another eproduct
		stm.executeUpdate("insert into eproduct (name, price,date_added) values('Tablet',1500.00,now())");
		
		//Execute Query by using Statement
		ResultSet result = stm.executeQuery("select * from eproduct");
		
		while(result.next()) {
			System.out.println(result.getInt("ID"));
			System.out.println(result.getString("name"));
			
		}
		con.close();

	}

}
