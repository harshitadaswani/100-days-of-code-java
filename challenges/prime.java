public class prime {
  public static void main(String[] args) {
    isPrime(5);

    int count=0;
    int i;
    for(i=10; i<=50; i++){
      if(isPrime(i)){
        count++;
      }
      if(count==3){
        System.out.println("Exiting the loop");
        break;
      }
    }
  }

  private static boolean isPrime(int n) {
    int j;
    if(n==1) {
      System.out.println("1 is neither odd or even");
      return false;
    }

    for(j=2; j<=(n/2); j++) {
      if(n%j == 0) {
        System.out.println(n+" is not a prime number");
        return false;
      }
    }
    System.out.println(n+" is a prime number");
    return true;
  }
}