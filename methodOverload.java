public class methodOverload{
  
  public static void main(String[] args){
    System.out.println(calcFeetsandInchesToCms(6d , 8d));
    System.out.println(calcFeetsandInchesToCms(8d));
  }

  public static double calcFeetsandInchesToCms(double feet, double inches) {
    if((feet<0) || ((inches<0) && (inches>12)))  {
      return -1;
    }
    else  {
      double cm = (feet * 30.48d);
      cm = cm + (inches * 2.54d);
      return cm;
    }
  }

  public static double calcFeetsandInchesToCms(double inches) {
    if(inches<0)  {
      return -1;
    }
    else  {
      double cm = (inches * 2.54d);
      return cm;
    }
  }
}