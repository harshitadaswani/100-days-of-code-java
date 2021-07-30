public class control {
  public static void main (String[] args) {
    int score = 800;
    int level = 5;
    int bonus = 100;
    boolean gameover = true;
    if(gameover == true){
      int fscore = (score+level+bonus);
      System.out.println("final score:"+fscore);
    }
    
    int nscore = 10000;
    int nlevel = 8;
    int nbonus = 200;
    boolean ngameover = true;
    if(ngameover == true){
     int nfscore = (nscore+nlevel+nbonus);
      System.out.println("final score:"+nfscore);
    }
  }
}