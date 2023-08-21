public class SwitchCase {
  public static void main(String[] args){
    String person = "Shyam sir ko buba";
    switch (person){
      case "Ram":
        System.out.println("Ram bhancha: ");
        break;
      case "Shyam sir":
        System.out.println("Shyam sir bhannuhuncha: ");
        break;    
      case "Shyam sir ko buba":
        System.out.println("Shyam sir ko buba bhanibaksincha: ");
        break;      
      default:
        System.out.println("Khoi kasle bolyo: ");  
    }

    int numberOfPizzas = 5;
    switch (numberOfPizzas){
      case 1:
        System.out.println("Khako jastai lagena");
        break;
      case 2:
        System.out.println("Balla kehi hudaicha");
        break; 
      case 3:
        System.out.println("Ajhai jancha");
        break;  
      case 4:
        System.out.println("No pain no gain");
        break;   
      case 5:
        System.out.println("Aba chai sakinna");
        break;  
    }
  }
}
