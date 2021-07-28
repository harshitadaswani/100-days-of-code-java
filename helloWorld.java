public class helloWorld {

  public static void main(String[] args)  {
    System.out.println("Hello world");
    int n=5;
    int m=5+6;
    int t = m+n;
    System.out.println(n);
    System.out.println(m);
    System.out.println(t);

    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
    System.out.println("Minimum Integer Value:"+min);
    System.out.println("Maximum Integer Value:"+max);
    System.out.println("Busted Integer Value:"+(min-1));
    System.out.println("Busted Integer Value:"+(max+1));

    byte min = Byte.MIN_VALUE;
    byte max = Byte.MAX_VALUE;
    System.out.println("Minimum Integer Value:"+min);
    System.out.println("Maximum Integer Value:"+max);
    System.out.println("Busted Integer Value:"+(min-1));
    System.out.println("Busted Integer Value:"+(max+1));
  }
}