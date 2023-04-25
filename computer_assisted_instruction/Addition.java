// Addition for children
import java.security.SecureRandom;
import java.util.Scanner;

public class Addition{
  private static final SecureRandom randomNumbers = new SecureRandom();

  public static boolean addition (){
    byte number1 = (byte)(1 + randomNumbers.nextInt(10));
    byte number2 = (byte)(1 + randomNumbers.nextInt(10));

    Scanner input = new Scanner(System.in);

    System.out.print(number1 + " + " + number2 + " = ");
    byte result = input.nextByte();

    boolean right = true;

    SecureRandom answerRandom = new SecureRandom();
    byte answer = 0;

    while (result != number1 + number2){

      right = false;
      answer = (byte)(answerRandom.nextInt(4));

      switch(answer){
        case 0: System.out.println("No. Please try again.");
          break;
        case 1: System.out.println("Wrong. Try once more.");
          break;
        case 2: System.out.println("Don't give u!");
          break;
        default: System.out.println("No. Keep trying.");
      }

      System.out.print( number1 + " + " + number2 + " = ");
      result = input.nextByte();
    }


    switch(answer){
      case 0: System.out.println("Very good!");
        break;
      case 1: System.out.println("Excellent!");
        break;
      case 2: System.out.println("Nice work!");
        break;
      default: System.out.println("Keep up the good work!");
    }

    return right;  
  }

}
