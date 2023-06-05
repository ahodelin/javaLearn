public class HourlyEmployee extends Employee{
  private double hours;
  private double wages;

  public HourlyEmployee(String firstName, String lastName, 
    String socialSecurityNumber, double hours, double wages){

    super(firstName, lastName, socialSecurityNumber);

    if(hours < 0.0 || hours > 168)
      throw new IllegalArgumentException(
        "Hours must be between 0.0 and 168.0"
      );

    if(wages < 0.0)
      throw new IllegalArgumentException(
        "Wage must be > 0.0"
      );

    this.hours = hours;
    this.wages = wages;
  }


  public void setHours(double hours){
    if(hours < 0.0 || hours > 168)
      throw new IllegalArgumentException(
        "Hours must be between 0.0 and 168"
      );
    this.hours = hours;
  }

  public double getHours(){
    return this.hours;
  }

  public void setWages(double wages){
    if(wages < 0.0)
      throw new IllegalArgumentException(
        "Wage mus be > 0.0"
      );
    this.wages = wages;
  }

  public double getWages(){
    return this.wages;
  }

  public double earnings(){
    return this.getWages() * this.getHours();
  }

  @Override
  public String toString(){
    return String.format(
      "%s%n%s: %.2f%n%s: %.2f",
      super.toString(),
      "hours", this.getHours(),
      "wages", this.getWages()
    );
  }
}
