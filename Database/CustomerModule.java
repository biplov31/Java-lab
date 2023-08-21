public class CustomerModule{
	public static void main(String[] args){
		Connection cn = DatabaseConnection.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter card number: ");
		int cardNumber = Integer.parseInt(sc.nextLine());
		System.out.print("Enter PIN: ");
		int pin = Integer.parseInt(sc.nextLine());
		verifyPIN(cardNumber, pin);
		sc.close();
	}
	
	private static void verifyPIN(int cardNumber, int pin){
		try{
			statement stat = cn.createStatement();
			String sql = "select * from account where cardNumber="+cardNumber+" and pin="+pin;
			ResultSet rs = stat.executeQuery(sql);
			if(rs.next())
				System.out.println("Valid PIN.");
			else
				System.out.println("Invalid PIN.");
		} catch (SQLException)
	}
}