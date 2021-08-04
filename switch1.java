public class switch1 {
  public static void main(String[] args) {
    char value ='A';
    
    switch(value) {
      case 'A':  
        System.out.println("The character entered was A");
        break;

      case 'B':  
        System.out.println("The character entered was B");
        break;

      case 'C':  
        System.out.println("The character entered was C");
        break;

      case 'D':  
        System.out.println("The character entered was D");
        break;

      case 'E':  
        System.out.println("The character entered was E");
        break;
      
      default:
        System.out.println("The character entered wasn't from A to E");
        break;
    }
  }
}