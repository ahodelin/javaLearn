import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAssistedInstruction{
  private static final SecureRandom randomNumbers = new SecureRandom();

  public static void main (String[] args){

      Scanner input = new Scanner(System.in);

      System.out.print("Insert a difficulty grad between 1 and 3: ");
      byte difficulty = input.nextByte();

      System.out.println("Insert the type of problems:");
      System.out.println("Only Addition: 1");
      System.out.println("Only Substraction: 2");
      System.out.println("Only Multiplication: 3");
      System.out.println("Only Division: 4");
      System.out.print("Random mix of all aritmethic operations: 5 ");

      byte problemType = input.nextByte();
      byte score = 0;

      switch(problemType){
        case 1: score = Addition.instructor(difficulty);
          break;
        case 2: score = Substraction.instructor(difficulty);
          break;
        case 3: score = Multiplication.instructor(difficulty);
          break;
        case 4: score = Addition.instructor(difficulty);
          break;
        default: score = randomOperaions(difficulty);
          break;
      }

      if(score < 7)
        System.out.println("Please ask your teacher for extra help.");
      else
        System.out.println("Congratulations, you are ready to go to the next level!");
  }

  public static byte randomOperaions(byte difficulty){
    boolean right = true;
    byte scoreOperations = 0;

    for(byte i = 0; i < 10; i++){
      
      byte operation = (byte)(1 + randomNumbers.nextInt(4));
      
      switch(operation){
        case 1: right = Addition.addition(difficulty);
          break;
        case 2: right = Substraction.substraction(difficulty);
          break;
        case 3: right = Multiplication.multiplication(difficulty);
          break;
        case 4: right = Division.division(difficulty);
          break;
      }
      if(right)
        scoreOperations++;
    }
    return scoreOperations;
  }
}
