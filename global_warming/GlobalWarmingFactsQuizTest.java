import java.util.Scanner;

public class GlobalWarmingFactsQuizTest{
  public static void main (String[] args){
    GlobalWarmingFactsQuiz quiz = new GlobalWarmingFactsQuiz();
    for(int i = 0; i < 5; i++){
      System.out.println(quiz.showQuestionWithAnswers(i));
      
      Scanner input = new Scanner(System.in);

      System.out.print("Select an answer for the question " + (i + 1) + " between 1 and 4: ");
      int an = input.nextInt();

      quiz.setAnswers(i, an);

      System.out.println();
    }

    System.out.println(quiz.getQualification());

    // int[] ans = quiz.getAnswers();

    //for(int i = 0; i < ans.length; i++)
//	System.out.printf("Answer for %d: %d %n", i + 1, ans[i]);    
  }
}
