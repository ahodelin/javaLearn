import java.security.SecureRandom;

public class PollingTest{
  public static void main(String[] args){
    SecureRandom randomVote = new SecureRandom();

    Polling polling = new Polling();

    int rating = 0;

    System.out.printf("Rows: %d, Columns: %d %n", polling.getRows(), polling.getColumns() );

    for(int is = 0; is < polling.getRows(); is ++)
      for(int ra = 0; ra < polling.getColumns(); ra ++ ){
        rating = randomVote.nextInt(polling.getColumns());

        polling.setResponses(is, ra, rating);
     }

    String[] top = polling.getTopics();
    int[][] resp = polling.getResponses();
    double[] avg = polling.getResponsesAverages();

    double maxAvg = 0.0;
    int posMax = 0;

    double minAvg = polling.getColumns();
    int posMin = 0;

    for(int i = 0; i < polling.getRows(); i ++){
      // shows issues
      System.out.printf("%s ", top[i]);
      for(int r = 0; r < polling.getColumns(); r ++)
       // shows table part with rating values
       System.out.printf("%d ", resp[i][r]);

      // shows averages
      System.out.printf("AVG: %.2f", avg[i]);

      System.out.println();

      //search max
      if(maxAvg < avg[i]){
         maxAvg = avg[i];
         posMax = i;
      }

      // search min
      if(minAvg > avg[i]){
         minAvg = avg[i];
         posMin = i;
      }
    }

    System.out.printf(
      "%s %.2f%n%s %.2f%n",
      top[posMin], minAvg, top[posMax], maxAvg  
    );
  }
}
