public class decimal  {
  
  public static void main(String[] args)  {
    areEqualByThreeDecimalPlaces(3.1756, 3.176);
  }

  public static boolean areEqualByThreeDecimalPlaces(double one, double two)  {
    int a = (int) (one * 1000);
    int b = (int) (two * 1000);

    if(a == b){
        System.out.println("true");
        return true;
    }
    
    else{
        System.out.println("false");
        return false;
    }
  }
}

/* public class decimal  {
  
  public static void main(String[] args)  {
    areEqualByThreeDecimalPlaces(3.175, 3.176);
  }

  public static boolean areEqualByThreeDecimalPlaces(double one, double two)  {
    int a = (int) one * 1000;
    int b = (int) two * 1000;

    if(a == b){
        System.out.println(true);
        return true;
    }
    
    else{
        System.out.println(false);
        return false;
    }
  }
}

public class DecimalConverter {
    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-2.1756, -2.175);
        
    }


    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        int a = (int) (one * 1000);
        int b = (int) (two * 1000);
        if(a==b) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
        
    }
}
*/
