import java.security.SecureRandom;

public class StudentPollMod{
  public static void main(String[] args){
    SecureRandom randomNumbers = new SecureRandom();
    
    int[] responses = new int[100];

    int[] frequency = new int[6];

    for(int answer = 0; answer < responses.length; answer ++){
      responses[answer] = 1 + randomNumbers.nextInt(5);
      try{
        ++frequency[responses[answer]];
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
        System.out.printf("  responses[%d] = %d%n%n",
          answer, responses[answer]
        );
      }
    }

    System.out.printf("%s%10s%n", "Rating", "Frequency");

    for(int rating = 1; rating < frequency.length; rating ++)
      System.out.printf("%6d%10d%n", rating, frequency[rating]);
  }
}
