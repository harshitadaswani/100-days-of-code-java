public class leapyear {
  public static void main(String[] args){
  int num = 2004;
  isLeapYear(num);
  }

  public static void isLeapYear(int year)  {
    if(year >= 0 && year <=9999)  {
      if( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) )  {
        System.out.println(year+" is a leap year");
      }
      else  {
        System.out.println(year+" is not a leap year");
      }
    }
    else  {
      System.out.println("Enter a valid year");
    }
  }
}
