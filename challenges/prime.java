public class prime {
  public static void main(String[] args) {
    isPrime(5);
  }

  private static boolean isPrime(int n) {
    int i;
    if(n==1) {
      System.out.println("1 is neither odd or even");
      return false;
    }

    for(i=2; i<=(n/2); i++) {
      if(n%i == 0) {
        System.out.println(n+" is not a prime number");
        return false;
      }
    }
    System.out.println(n+" is a prime number");
    return true;
  }
}