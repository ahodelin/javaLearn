public class ComputerAssistedInstruction{
  public static void main (String[] args){
      Multiplication m = new Multiplication();

      Addition a = new Addition();

      Substraction s = new Substraction();

      Division d = new Division();

//      instructor(m);

//      instructor(a);

//      instructor(s);

      instructor(d);
//    Addition.addition();

//    Substraction.substraction();

  //  Division.division();
  }

  public static void instructor (Multiplication mult){
    System.out.println("Miltiplication");
    byte pointsMult = 0;
   
    for(int i = 0; i < 10; i++){
      if(Multiplication.multiplication())
        pointsMult ++;
    }

    if(pointsMult < 7)
      System.out.println("Please ask your teacher for extra help.");
    else
      System.out.println("Congratulations, you are ready to go to the next level!");
  }

  public static void instructor (Addition add){
    System.out.println("Addition");
    byte pointsAdd = 0;

    for(int i = 0; i < 10; i++){
      if(Addition.addition())
        pointsAdd ++;
    }

    if(pointsAdd < 7)
      System.out.println("Please ask your teacher for extra help.");
    else
      System.out.println("Congratulations, you are ready to go to the next level!");
  }

  public static void instructor (Substraction sub){
    System.out.println("Substraction");
    byte pointsSub = 0;

    for(int i = 0; i < 10; i++){
      if(Substraction.substraction())
        pointsSub ++;
    }

    if(pointsSub < 7)
      System.out.println("Please ask your teacher for extra help.");
    else
      System.out.println("Congratulations, you are ready to go to the next level!");
  }

  public static void instructor (Division div){
    System.out.println("Division");
    byte pointsDiv = 0;

    for(int i = 0; i < 10; i++){
      if(Division.division())
        pointsDiv ++;
    }

    if(pointsDiv < 7)
      System.out.println("Please ask your teacher for extra help.");
    else
      System.out.println("Congratulations, you are ready to go to the next level!");
  }
}
