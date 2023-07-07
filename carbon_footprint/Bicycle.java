public class Bicycle implements CarbonFootprint{
  private Car car = new Car(7.0);
  
  @Override
  public double getCarbonFootprint(){
    return car.getCarbonFootprint() * 0.08;
  }

  @Override
  public String toString(){
    return String.format("%s%n%s%.2f",
      "Bicycle", "Carbon Footprint: ", this.getCarbonFootprint()
    );
  }
}
