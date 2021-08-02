public class challenge2 {
  public static void main(String[] args)  {
    double number = 10.5;
    printConversion(number);
  }

  public static int toMilesPerHour(double kmh) {
  if(kmh < 0){
    return -1;
  }
  else  {
    return (int) Math.round(kmh/1.609);
  }
  }

  public static void printConversion(double kmh)  {
    if(kmh<0) {
      System.out.println("Invalid value");
    }
    else  {
      long mile = toMilesPerHour(kmh);
      System.out.println(kmh+" km/h = "+mile+" mi/h");
    }
  }
}