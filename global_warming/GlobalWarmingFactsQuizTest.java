public class GlobalWarmingFactsQuizTest{
  public static void main (String[] args){
    GlobalWarmingFactsQuiz quiz = new GlobalWarmingFactsQuiz();
    for(int i = 0; i < 5; i++)
      System.out.println(quiz.showQuestionWithAnswers(i));
  }
}
