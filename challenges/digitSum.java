public class digitSum {
  
  public static void main(String[] args) {
    System.out.println("Sum of digits of 125 is "+sumDigits(125));
  }

  private static int sumDigits(int num) {
    if(num<10) {
      return -1;
    }
    int sum = 0;
    while(num>0) {
      int digit = num%10;
      sum = sum + digit;
      num = num / 10;
    }
    return sum;
  }
}