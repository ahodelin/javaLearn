public class Polling{

  private final String[] topics = {
    "Issue 1",
    "Issue 2",
    "Issue 3",
    "Issue 4",
    "Issue 5"
  };

  private int[][] responses = new int[5][10];

  public String[] getTopics(){
    return this.topics;
  }

  public int[][] getResponses(){
    return this.responses;
  }

  public int getRows(){
    return this.responses.length;
  }

  public int getColumns(){
    return this.responses[0].length;
  }

  public void setResponses(int issue, int rating, int value){
    if(issue < this.responses.length && rating < this.responses[0].length){
      this.responses[issue][rating] = value + 1;
    }
  }

  public double[] getResponsesAverages(){
    double[] averages = new double[getRows()];

    for(int r = 0; r < getRows(); r ++){
      for(int c = 0; c < getColumns(); c ++){
        averages[r] += responses[r][c];
      }
      averages[r] = averages[r] / getColumns();
    }

   return averages;
  }
}
