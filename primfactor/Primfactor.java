// Primfactors of a number, number >= 2

import java.util.Scanner;

public class Primfactor{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Insert a number grather or equal than 2: ");
    int n = input.nextInt();

    int t = 2;
    System.out.println("Primfactors");
    while (n > 1){
      if (n % t == 0){
        n /= t;
        System.out.printf("%d %n", t);
      }
      else
        t++;
    }
  }
}
