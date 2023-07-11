import java.util.ArrayList;

public class CarbonFootprintTest{
  public static void main(String[] args){
  ArrayList<CarbonFootprint> carbonFootprint= new ArrayList<CarbonFootprint>();

  carbonFootprint.add(new Car(7.8));
  carbonFootprint.add(new Bicycle());
  carbonFootprint.add(new Building(4.0, 5.0));

  for(int i = 0; i < carbonFootprint.size(); i ++)
    System.out.printf("%s%n", carbonFootprint.get(i));
  }
}
