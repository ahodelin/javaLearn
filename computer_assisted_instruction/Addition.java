// Addition for children
import java.security.SecureRandom;
import java.util.Scanner;

public class Addition{
  private static final SecureRandom randomNumbers = new SecureRandom();

  public static void addition (){
    byte number1 = (byte)(1 + randomNumbers.nextInt(10));
    byte number2 = (byte)(1 + randomNumbers.nextInt(10));

    Scanner input = new Scanner(System.in);

    System.out.print("How much is " + number1 + " + " + number2 + "? ");
    byte result = input.nextByte();

    while (result != number1 + number2){
      System.out.println("No. Please try again.");
      System.out.print("How much is " + number1 + " + " + number2 + "? ");
      result = input.nextByte();
    }

      System.out.println("Very good!");
  }
}
