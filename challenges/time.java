public class time {
  public static void main(String[] args) {
    System.out.println(getDurationString(65,6));
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
}