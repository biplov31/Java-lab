public class Break{
	public static void main(String[] args){
		for(int a=5; a<=10; a++){
			if(a==8){ // with a conditional, our statement is reachable
				//break; // 5, 6, 7
				//return;  // 5, 6, 7
				continue; // 5, 6, 7, 9, 10
			}
			//continue;  // unreachable statement
			//return; 		// unreachable statement
			System.out.println(a);
			//break;  // 5
			// continue; // 5
			//return;  // 5
		}
	}
}