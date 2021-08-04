public class for1 {
  public static void main(String[] args)  {
    int a = 10000;
    int i;
    for(i=2; i<9; i++){
      System.out.println("Interest on amount = "+a+" at rate = "+i+" is: "+calcInterest(a,i));
    }
  }

  private static int calcInterest(int amount, double rate){
    int interest = (int) (amount*(rate/100));
    return interest;
  }
}