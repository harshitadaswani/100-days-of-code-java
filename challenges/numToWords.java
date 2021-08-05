public class numToWords {
  public static void main(String[] args)  {
    numberToWords(599);
  }

  public static int numberToWords(int num)  {
      while(num!=0)  {
        int a = num%10;
        switch(a) {
          case 0: {
            System.out.println("Zero");
            break;
          }
          case 1: {
            System.out.println("One");
            break;
          }
          case 2: {
            System.out.println("Two");
            break;
          }
          case 3:  {
            System.out.println("Three");
            break;
          }
          case 4: {
            System.out.println("Four");
            break;
          }
          case 5: {
            System.out.println("Five");
            break;
          }
          case 6: {
            System.out.println("Six");
            break;
          }
          case 7: {
            System.out.println("Seven");
            break;
          }
          case 8:  {
            System.out.println("Eight");
            break;
          }
          case 9: {
            System.out.println("Nine");
            break;
          }
        }
        num= num/10;
      }
      return -1;  
  }

  public static int reverse(int n)  {
    int rem,new;
    new = 0; 
    while(n!=0) {
      rem = n%10;
      new = new+rem;
      new = new*10;
      n = n/10;
    }
    new = new/10;
    return new;
  }

  public static int getDigitCount(int count)  {

  }
}