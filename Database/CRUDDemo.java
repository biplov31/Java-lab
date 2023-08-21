public static CRUDDemo {
	 public static void main(String[] args){
        try{           
            // Creating statement
            Statement stat = cn.createStatement();
            //insertData(stat);
           
            selectData(stat);
           
//            updateData(stat);
           
//            deleteData(stat);
           
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch(SQLException se){
            se.printStackTrace();
        }
    }
    private static void deleteData(Statement stat) throws SQLException {
        String deleteQuery = "delete from account where full_name = 'Bhupendra Sahakari'";
        stat.executeUpdate(deleteQuery);
        System.out.println("Delete success");
    }
    private static void updateData(Statement stat)throws SQLException  {
        String updateSql = "update account set full_name ='Bhupendra Sahakari' where full_name ='Bhupendra Shrestha'";
        stat.executeUpdate(updateSql);
        System.out.println("Update success!");
    }
   
    private static void selectData(Statement stat) throws SQLException {
        String selectQuery = "select * from account";
        ResultSet rs = stat.executeQuery(selectQuery);
       
        ArrayList<Account> accounts = new ArrayList<>();
       
        while(rs.next()) {
            Account account = new Account();
           
            String fullName = rs.getString("full_name");
            account.setFullName(fullName);
            String cardNumber = rs.getString("card_number");
            account.setAccountNumber(cardNumber);
           
            accounts.add(account);
        }
       
        //for loop iterating
        // for(Class obj: list){
        //}
        accounts.forEach(account ->{
            System.out.println(account.getFullName());
        });
       
    }

    private static void insertData(Statement stat) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String fullName = sc.nextLine();
		System.out.print("Enter PIN: ");
		int pin = Integer.parseInt(sc.nextLine());
        // String sql = "insert into account (full_name, card_number, pin, balance) values ('Bhupendra Shrestha', 1234567890, 1234, 10500.50)";
        String sql = "insert into account (full_name, card_number, pin, balance) values ('"+fullName+"', 
		stat.executeUpdate(sql); // insert/update
    }
}
}