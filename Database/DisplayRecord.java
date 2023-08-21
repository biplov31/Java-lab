import java.sql.*;
public class DisplayRecords {
  static final String DB_URL = "jdbc:mysql://localhost/database_name";
  static final String USER = "username";
  static final String PASS = "password";
  
  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL,USER,PASS); // "Connecting to database..."
      stmt = conn.createStatement(); // Creating statement
      String sql;
      sql = "SELECT * FROM table_name";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
         System.out.println("ID: " + rs.getInt("id"));
         System.out.println("Name: " + rs.getString("name"));
         System.out.println("Age: " + rs.getString("age"));
      }
      rs.close();
      stmt.close();
      conn.close();
    } catch(SQLException se) {
      se.printStackTrace();
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(stmt!=null)
          stmt.close();
      } catch(SQLException se2) {
      }
      try {
        if(conn!=null)
          conn.close();
      } catch(SQLException se) {
        se.printStackTrace();
      }
    }
  }
}

 
public class JdbcDemo {
	public static void main(String[] args){
		Connection conn = null; 
		Statement st = null;
		ResultSet rs = null;   // special object to store tabular data fetched from sql  
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "");
			st = conn.createStatement();
			
			String qry = "select * from myTable";
			rs = st.executeQuery(qry);
			
			while(rs.next()){  // rs can have multiple rows same as our database table
				System.out.print("Name: " + rs.getString(1) + " Email: " + rs.getString(2));  // we can also use the column number (0, 1, 2) to get the data
			}	
			
		} catch(SQLException se) {
			se.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

import java.util.*;

public class AnotherDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String name, email;
		
		System.out.print("\nEnter your name: ");
		name = scan.nextLine();
		System.out.print("\nEnter your email: ");
		email = scan.nextLine();
		
		Connection conn = null; 
		Statement st = null; 
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "");
			st = conn.createStatement();
			
			String qry = "INSERT INTO 'myTable' ('name', 'email') VALUES ('"+name+"', '"+email+"')";  // '"++"'
			st.executeUpdate(qry);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}


