/* Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean 
and it needs to return true 
if the sum of the first and second parameter is equal to the third parameter. 
Otherwise, return false. */

public class sum {
  public static void main(String[] args)  {
    hasEqualSum(1,2,3);
  }

  public static boolean hasEqualSum(int a, int b, int c)  {
    int sum = a+b;
    if(sum == c)  {
      System.out.println(true);
      return true;
    }
    else {
      System.out.println(false);
      return false;
    }
  }
}