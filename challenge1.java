public class challenge1 {
  public static void main(String[] args)  {
    checkNumber(40);
  }

  public static void checkNumber(int num)  {
    if(num > 0) {
      System.out.println("Positive");
    }
    else if(num<0)  {
      System.out.println("Negative");
    }
    else  {
      System.out.println("Not a number");
    }
  }
}