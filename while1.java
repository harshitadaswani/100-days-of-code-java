public class while1 {
  public static void main(String[] args) {
    int a=4, b=20, c=0;
    System.out.println("Even Numbers between 4 to 20 are as belows.");
    System.out.println(" ");
    while(a<=b) {
      a++;
      if(!isEven(a)) {
        continue;
      }
      c++;
      if(c>=6){
        break;
      }
      System.out.println("Even Number: "+a);
    }
    System.out.println(" ");
    System.out.println("Total Even Numbers Found: "+c);
  }

  private static boolean isEven(int n) {
    if(n%2==0) {
      return true;
    }
    else {
      return false;
    }
  }
}