public class CarNew{
  private static final double Factor = 2.370;
  private double consumptionPer100Km;

  public CarNew(double consumpitonPer100Km){
    if(consumpitonPer100Km < 0)
      throw new IllegalArgumentException("The comsumption per 100 km must be >= 0");

    this.consumptionPer100Km = consumptionPer100Km;
  }

  public double getConsumptionPer100Km(){
    return this.consumptionPer100Km;
  }

 // @Override
  public double getCarbonFootprint(){
    return Factor * this.getConsumptionPer100Km();
  }

  @Override
  public String toString(){
    return String.format("%s%n%s%.2f",
      "Car", "Carbon Footprint: ", this.getCarbonFootprint()
    );
  }
}
