// calculate bmi
import java.util.Scanner;

public class BMICalculator{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Weight in kilogram: ");
    double w = input.nextDouble();

    System.out.print("Height in meter: ");
    double h = input.nextDouble();

    BMI bmi = new BMI(w, h); 

    System.out.println(bmi);
  }
}
