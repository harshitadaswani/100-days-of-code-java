public class forsum {
  public static void main(String[] args) {
    int i;
    int sum=0;
    int count=0;
    for(i=1; i<1001; i++) {
      if((i%3==0) && (i%5==0)) {
        System.out.println("Found number is: "+i);
        sum = (sum + i);
        count++;
      }
      if(count==5) {
        System.out.println(sum);
        break;
      }
    }
  }
}