// Multiplication for children
import java.security.SecureRandom;
import java.util.Scanner;

public class Multiplication{
  private static final SecureRandom randomNumbers = new SecureRandom();

  public static boolean multiplication (byte difficulty){
    short interval = 1;

    switch(difficulty){
      case 1: interval *= 10;
         break;
      case 2: interval *= 100;
         break;
      default: interval *= 1000;
        break;
    }
        
    short number1 = (short)(1 + randomNumbers.nextInt(interval));
    short number2 = (short)(1 + randomNumbers.nextInt(interval));

    Scanner input = new Scanner(System.in);

    System.out.print( number1 + " x " + number2 + " = ");
    int result = input.nextByte();

    boolean right = true;

    SecureRandom answerRandom = new SecureRandom();
    byte answer = 0;

    while (result != number1 * number2){

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

      System.out.print(number1 + " x " + number2 + " = ");
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

  public static byte instructor (byte difficulty){
    byte pointsMult = 0;

    for(int i = 0; i < 10; i++){
      if(multiplication(difficulty))
        pointsMult ++;
    }

    return pointsMult;
  }
}
