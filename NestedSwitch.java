public class NestedSwitch {
  public static void main(String[] args){
    int semester = 3;
    int subject = 1;
    switch (semester){
      case 1:
        System.out.println("1st semester subject: ");
        // int subject = 1;
        switch (subject){
          case 1:
            System.out.println("Digital Logic");
            break;
          case 2:
            System.out.println("Discrete Math");
            break;  
        }
        break;
      case 2:
        System.out.println("2nd semester subject: ");
        // int subject2 = 2;
        switch (subject){
          case 1:
            System.out.println("Microprocessor");
            break;
          case 2:
            System.out.println("C Programming");
            break;  
        }
        break;
      case 3:
        System.out.println("3rd semester subject: ");
        // int subject3 = 1;
        switch (subject){
          case 1:
            System.out.println("Java Programming");
            break;
          case 2:
            System.out.println("Data Structure and Algorithm");
            break;  
        }
        break;            
    }
  }
}
