public class time {
  public static void main(String[] args) {
    System.out.println(getDurationString(65,6));
    System.out.println(getDurationString(65));
  }

  public static String getDurationString(int minutes, int seconds) {
    if((minutes<0) || ((seconds<0) && (seconds>59)))  {
      return "Invalid value";
    }
    else {
      int hour = (minutes/60);
      int minutesLeft = (minutes%60);
      return "Hours: "+hour+" Minutes: "+minutesLeft+" Seconds: "+seconds;
    }
  }

   public static String getDurationString(int seconds) {
    if(seconds<0)  {
      return "Invalid value";
    }
    else {
      int minutes = (seconds/60);
      int secondsLeft = (seconds%60);
      String a = getDurationString(minutes,secondsLeft);
      return a; 
      //return Minutes: "+minutes+" Seconds: "+secondsLeft;
    }
  }
}