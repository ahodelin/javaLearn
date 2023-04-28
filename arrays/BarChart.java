import java.security.SecureRandom;

public class BarChart{
  public static void main(String[] args){
    SecureRandom randomNumber = new SecureRandom();

    int[] students = new int[100];

    int[] grade = new int[11];

    for(int student = 0; student < students.length; student ++){
      int note = 1 + randomNumber.nextInt(100);
      students[student] = note;
      grade[note / 10] ++;
    }
       
    System.out.println("Grade distribution:");

    for(int counter = 0; counter < grade.length; counter ++){
      if(counter == 10)
        System.out.printf("%5d: ", 100);
      else
        System.out.printf("%02d-%02d: ", 
          counter * 10, counter * 10 + 9
        );

      for(int stars = 0; stars < grade[counter]; stars ++)
        System.out.print("*");

      System.out.println(); 
    }
  }
}
