import java.security.SecureRandom;

public class PollingTest{
  public static void main(String[] args){
    SecureRandom randomVote = new SecureRandom();

    Polling polling = new Polling();

    int issue = 0;
    int rating = 0;

    System.out.printf("Rows: %d, Columns: %d %n", polling.getRows(), polling.getColumns() );

    for(int is = 0; is < polling.getRows(); is ++)
      for(int ra = 0; ra < polling.getColumns(); ra ++ ){
        issue = randomVote.nextInt(polling.getRows());
        rating = randomVote.nextInt(polling.getColumns());

        polling.setResponses(issue, rating);
     }

    String[] top = polling.getTopics();
    int[][] resp = polling.getResponses();

    for(int i = 0; i < polling.getRows(); i ++){
      System.out.printf("%s ", top[i]);
      for(int r = 0; r < polling.getColumns(); r ++)
       System.out.printf("%d ", resp[i][r]);

      System.out.println();
    }
  }
}
