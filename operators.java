public class operators{

public static void main (String[] args)  {
  double a = 20.00d;
  double b = 80.00d;
  System.out.println(a);
  System.out.println(b);
  double c = (a + b) * 100d;
  System.out.println(c);
  double d = c % 40.00d;
  System.out.println(d);
  boolean e = (d == 0) ? true : false;
  System.out.println(e);
  if(!e){
    System.out.println("Got some Remainder");
  }
}
}