public class control {
  public static void main (String[] args) {
    int score = 800;
    int level = 5;
    int bonus = 100;
    boolean gameover = true;
    calculateScores(true, 800, level, score);
    
    int nscore = 10000;
    int nlevel = 8;
    int nbonus = 200;
    boolean ngameover = true;
    calculateScores(true, 10000, nlevel, nscore);
    
  }
  public static void calculateScores(boolean gameover, int score, int level, int bonus) {
    int score, level, bonus;
    boolean gameover;
    if(gameover == true){
      int fscore = (score+level+bonus);
      System.out.println("final score:"+fscore);
    }
  }
}