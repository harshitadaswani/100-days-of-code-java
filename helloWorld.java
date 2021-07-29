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

    byte mina = Byte.MIN_VALUE;
    byte maxa = Byte.MAX_VALUE;
    System.out.println("Minimum Byte Value:"+mina);
    System.out.println("Maximum Byte Value:"+maxa);
    System.out.println("Busted Byte Value:"+(mina-1));
    System.out.println("Busted Byte Value:"+(maxa+1));

    long minb = Long.MIN_VALUE;
    long maxb = Long.MAX_VALUE;
    System.out.println("Minimum Long Value:"+minb);
    System.out.println("Maximum Long Value:"+maxb);
    System.out.println("Busted Long Value:"+(minb-1));
    System.out.println("Busted Long Value:"+(maxb+1));

    short minc = Short.MIN_VALUE;
    short maxc = Short.MAX_VALUE;
    System.out.println("Minimum Short Value:"+minc);
    System.out.println("Maximum Short Value:"+maxc);
    System.out.println("Busted Short Value:"+(minc-1));
    System.out.println("Busted Short Value:"+(maxc+1));

    //casting
    byte a = (byte) (maxa/2);
    System.out.println("casting value:"+a);

    // //primitive data challenge
    // byte b=100;
    // short c=10000;
    // int d= 1000;
    // long e= 50000L + 10L * (byte)

    float mind = Float.MIN_VALUE;
    float maxd = Float.MAX_VALUE;
    System.out.println("Minimum Float Value:"+mind);
    System.out.println("Maximum Float Value:"+maxd);
    System.out.println("Busted Float Value:"+(mind-1));
    System.out.println("Busted Float Value:"+(maxd+1));

    double mine = Double.MIN_VALUE;
    double maxe = Double.MAX_VALUE;
    System.out.println("Minimum Double Value:"+mine);
    System.out.println("Maximum Double Value:"+maxe);
    System.out.println("Busted Double Value:"+(mine-1));
    System.out.println("Busted Double Value:"+(maxe+1));

    // float challenge
    //convert pounds to kilograms
    double p = 400d;
    double kg = p * 0.45359237d;
    System.out.println("Converted Kilograms:"+kg);

  }
}
