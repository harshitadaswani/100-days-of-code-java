public class method {
  public static void main (String[] args) {
      
    int score = 800;
    int level = 5;
    int bonus = 100;
    boolean gameover = true;
    int highScore=calculateScores(true, 800, level, score);
    //System.out.println("final score:"+highScore);
    
    int nscore = 10000;
    int nlevel = 8;
    int nbonus = 200;
    boolean ngameover = true;
    int nHighScore=calculateScores(true, 10000, nlevel, nscore);
    //System.out.println("final score:"+nHighScore);
    
    int highScorePosition = calculateHighScore(1500);
    displayHighScore("Jay" , highScorePosition);

    highScorePosition = calculateHighScore(900);
    displayHighScore("Ayush" , highScorePosition);

    highScorePosition = calculateHighScore(400);
    displayHighScore("Devang" , highScorePosition);

    highScorePosition = calculateHighScore(50);
    displayHighScore("Tarun" , highScorePosition);
  }
  public static int calculateScores(boolean gameover, int score, int level, int bonus) {
    if(gameover == true){
      int fscore = (score+level+bonus);
        return fscore;
    }
    return -1;
  }
  public static void displayHighScore(String pname, int position) {
    System.out.println(pname+" has managed to score "+position+ " in the high score table.");
  }
  public static int calculateHighScore(int pscore){
    
    if(pscore > 1000){
      return 1;
    }
    
    if(pscore < 1000 && pscore > 500){
      return 2;
    }

    if(pscore < 500 && pscore > 100){
      return 3;
    }

    else{
      return 4;
    }
  }
}