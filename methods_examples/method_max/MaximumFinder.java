import java.util.Scanner;

public class MaximumFinder{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter three floating-point values separated by spaces: ");

    double n1 = input.nextDouble();
    double n2 = input.nextDouble();
    double n3 = input.nextDouble();

    double result = maximum(n1, n2, n3);
    
    double resultMath = maximumMath(n1, n2, n3);

    System.out.println("Maximum hand made is: " + result);
    System.out.println("Maximum with Math.max: " + resultMath);

  }

  public static double maximum(double n1, double n2, double n3){
    double maximumValue = n1;

    if(n2 > maximumValue)
      maximumValue = n2;
    if(n3 > maximumValue)
      maximumValue = n3;

    return maximumValue;
  }

  public static double maximumMath(double n1, double n2, double n3){
   return Math.max(n1, Math.max(n2, n3));
  }
}
