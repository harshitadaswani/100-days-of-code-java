public class switch1 {
  public static void main(String[] args) {
    printDayOfTheWeek(4);
  }

  private static void printDayOfTheWeek(int day)  {
    switch(day) {
      case 0:  
        System.out.println("The day entered was Sunday");
        break;

      case 1:  
        System.out.println("The day entered was Monday");
        break;

      case 2:  
        System.out.println("The day entered was Tuesday");
        break;

      case 3:  
        System.out.println("The day entered was Wednesday");
        break;

      case 4:  
        System.out.println("The day entered was Thursday");
        break;

      case 5:  
        System.out.println("The day entered was Friday");
        break;

      case 6:  
        System.out.println("The day entered was Saturday");
        break;
      
      default:
        System.out.println("Invalid day entered");
        break;
    }
  }
}