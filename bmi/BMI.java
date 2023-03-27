// calculate bmi
import java.util.Scanner;

public class BMI{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Weight in kilogram: ");
    double w = input.nextDouble();

    System.out.print("Height in meter: ");
    double h = input.nextDouble();

    BMICalculator bmi = new BMICalculator(w, h); 

    System.out.println(bmi);
    
    /*
    if (bmi < 18.5)
      System.out.println("Underweight");
    else if (bmi >= 18.5 && bmi <= 24.9)
      System.out.println("Normal weight");
    else if (bmi > 24.9 && bmi <= 29.9)
      System.out.println("Overweight");
    else
      System.out.println("Obesity");
    */
  }
}
