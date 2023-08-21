public class VariableDemo{
  private String name = "Radha";
  
  private void printName(){  // access modifier, return type, method name
    // String name = "Ishit";  // local variable is prioritized over instance variable
    System.out.println(name);
  }
 
  public static void main(String[] args){
    // VariableDemo vd = new VariableDemo();
    // vd.printName();
    printName(); //Why??
  }
}
