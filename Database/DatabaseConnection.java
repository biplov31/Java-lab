import java.sql.*;

public class DatabaseConnection{
    public static Connection getConnection() {  // getConnection() method returns a Connection object
		Connection cn = null; // initializing object with a default value null
        try{
            // loading/register the driver
            Class.forName("com.mysql.jdbc.Driver");           
            //Creating connection
            String url = "jdbc:mysql://localhost:3306/bca_third_2022";
            String username = "root";
            String pw ="";
            cn = DriverManager.getConnection(url, username, pw);
            System.out.println("Database Connection Success!");
           
            // Creating statement
            // Statement stat = cn.createStatement();
            // String sql = "insert into account (full_name, card_number, pin, balance) values ('Bhupendra Shrestha', 1234567890, 1234, 10500.50)";
            // stat.executeUpdate(sql); // insert/update
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch(SQLException se){
            se.printStackTrace();
        }
    }
	
	class 
	
	private static void selectData(Statement stat) throws SQLException{
		String selectQuery = "select * from account";
		ResultSet rs = stat.executeQuery(selectQuery);
		while(rs.next()){
			
		}
		
	}
}
