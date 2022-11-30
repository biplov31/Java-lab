// ladder if statement, nested if statement
public class Conditional {
  public static void main(String[] args){
    String gender = "Male";
    boolean isAdult = true;
    
    if(gender == "Male"){
      if(isAdult == true){
        System.out.println("Lakka Jawan");
      }
    } else if (gender == "Female"){
      System.out.println("Not Lakka Jawan");
    } else {
      System.out.println("No comments");
    }
  }
  
}
