public class Building implements CarbonFootprint{
  private static final double ElectricityFactor = 0.6147;
  private final double electricity;
  private final double heating;

  public Building(double electricity, double heating){
    if(electricity < 0)
      throw new IllegalArgumentException("The electricity must be >= 0");

    if(heating < 0)
      throw new IllegalArgumentException("The heating must be >= 0");

    this.electricity = electricity;
    this.heating = heating;
  }

  public double getElectricity(){
    return this.electricity;
  }

  public double getHeating(){
    return this.heating;
  }

  @Override
  public double getCarbonFootprint(){
    return ElectricityFactor * this.getElectricity() * this.getHeating();
  }

  @Override
  public String toString(){
    return String.format(
      "%s%n%s%.2f",                                                                                                                                                                            
      "Building", "Carbon Footprint: ", this.getCarbonFootprint()
    );
  }
}
