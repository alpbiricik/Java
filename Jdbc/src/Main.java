import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class Main {

	
	public static void main(String[] args) {
		updateData();
		
	}
public static void insertData() {
	 Connection connection = null;
	    DbHelper helper = new DbHelper();
	    PreparedStatement statement = null;
	    ResultSet resultSet;
	    
	    try {
	    	String sql = "insert into customers (country,addressLine1,contactLastName,customerNumber,customerName,contactFirstName,phone,city) values\r\n"
	        		+ "(?,?,?,?,?,?,?,?);" ;
	    	helper.getConnection();
			connection = helper.getConnection();
	       
			
	        statement = connection.prepareStatement(sql);
	      
	        statement.setString(1, "Spain");
	        statement.setString(2, "cghffskkllddhsdg");
	        statement.setString(3, "Güler");
	        statement.setString(4, "6376");
	        statement.setString(5, "Arda");
	        statement.setString(6, "API");
	        statement.setString(7, "687637095785");
	        statement.setString(8, "Madrid");

	        statement.executeUpdate();
	        
	        System.out.println("Kayıt eklendi");
	        
	    } catch (SQLException e) {
			helper.showErrorMessage(e);
			
		}
}
public static void updateData() {
	Connection connection = null;
    DbHelper helper = new DbHelper();
    PreparedStatement statement = null;
    ResultSet resultSet;
    
    try {
    	String sql = "update customers set city=\"Barcelona\" where customerNumber = 6376;" ;
    	
		connection = helper.getConnection();
		    statement = connection.prepareStatement(sql);
        statement.executeUpdate();
        
        System.out.println("Kayıt güncellendi");
        
        
    } catch (SQLException e) {
		helper.showErrorMessage(e);
		
	}
}
public static void deleteData() {
	 Connection connection = null;
	    DbHelper helper = new DbHelper();
	    PreparedStatement statement = null;
	    ResultSet resultSet;
	    
	    try {
	    	String sql = "delete from customers where customerNumber = ? " ;
	    	helper.getConnection();
			connection = helper.getConnection();
		    statement = connection.prepareStatement(sql);
		    statement.setInt(1, 6375);
         statement.executeUpdate();
	        
	        System.out.println("Kayıt Silindi");
	        
	        
	    } catch (SQLException e) {
			helper.showErrorMessage(e);
			
		}
}
}

 