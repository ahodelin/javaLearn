public class NatureTest{
  public static void main(String[] args){
    for(Nature nature : Nature.values())
      System.out.printf("%-10s%-45s%n",
        nature, nature.getNature()
      );
    Nature n = Nature.ME;
    System.out.printf("Key: %s Name: %s%n", n, n.getNature());
  }
}
