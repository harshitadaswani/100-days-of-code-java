/* We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.

The method should return boolean 
and it needs to return true 
if one of the parameters is in range 13(inclusive) - 19 (inclusive).
Otherwise return false.*/

public class teen {
  public static void main(String args[])  {
  hasTeen(13,67,99);
  }

  public static boolean hasTeen(int a, int b, int c)  {
    if(a >= 13 && a <= 19){
      System.out.println(true);
      return true;
    }
    else if(b >= 13 && b <= 19){
      System.out.println(true);
      return true;
    }
    else if(c >= 13 && c <= 19){
      System.out.println(true);
      return true;
    }
    else  {
      System.out.ptintln(false);
      return false;
    }
  }
}