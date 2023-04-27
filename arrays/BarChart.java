import java.security.SecureRandom;

public class BarChart{
  public static void main(String[] args){
    SecureRandom randomNumber = new SecureRandom();

    int[] students = new int[100];

    int[] grade = new int[11];

    for(int student = 0; student < students.length; student ++){
      int note = 1 + randomNumber.nextInt(100);
      students[student] = note;

       if(note < 10)
         grade[0] ++;
       else if(note >= 10 && note < 20)
         grade[1] ++;
       else if(note >= 20 && note < 30)
         grade[2] ++;
       else if(note >= 30 && note < 40)
         grade[3] ++;
       else if(note >= 40 && note < 50)
         grade[4] ++;
       else if(note >= 50 && note < 60)
         grade[5] ++;
       else if(note >= 60 && note < 70)
         grade[6] ++;
       else if(note >= 70 && note < 80)
         grade[7] ++;
       else if(note >= 80 && note < 90)
         grade[8] ++;
       else if(note >= 90 && note < 100)
         grade[9] ++;
       else 
         grade[10] ++;
    }
       
//    int[] array = {};

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
