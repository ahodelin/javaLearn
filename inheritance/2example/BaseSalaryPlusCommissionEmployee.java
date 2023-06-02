public class BaseSalaryPlusCommissionEmployee{
  private final String firstName;
  private final String lastName;
  private final String socialSecurityNumber;
  private double grossSales;
  private double commissionRate;
  private double baseSalary;

  public BaseSalaryPlusCommissionEmployee(String firstName, String lastName, 
    String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){

    if(grossSales < 0.0)
      throw new IllegalArgumentException(
        "Gross sales must be >= 0.0"
      );

    if(commissionRate <= 0.0 || commissionRate >= 1.0)
      throw new IllegalArgumentException(
        "Commission rate must be > 0.0 and < 1.0"
      );

    if(baseSalary < 0.0)
      throw new IllegalArgumentException(
        "Base salary must be >= 0.0"
      );

    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
    this.grossSales = grossSales;
    this.commissionRate = commissionRate;
    this.baseSalary = baseSalary;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public String getSocialSecurityNumber(){
    return this.socialSecurityNumber;
  }

  public void setGrossSales(double grossSales){
    if(grossSales < 0.0)
      throw new IllegalArgumentException(
        "Gross sales must be >= 0.0"
      );
    this.grossSales = grossSales;
  }

  public double getGrossSales(){
    return this.grossSales;
  }

  public void setCommissionRate(double commissionRate){
    if(commissionRate <= 0.0 || commissionRate >= 1.0)
      throw new IllegalArgumentException(
        "Commission rate mus be > 0.0 and < 1.0"
      );
    this.commissionRate = commissionRate;
  }

  public double getCommissionRate(){
    return this.commissionRate;
  }

  public void setBaseSalary(double baseSalary){
    if(baseSalary < 0.0)
      throw new IllegalArgumentException(
        "Base salary must be >= 0.0"
      );
    this.baseSalary = baseSalary;
  }

  public double getBaseSalary(){
    return this.baseSalary;
  }

  public double earnings(){
    return this.baseSalary + (this.commissionRate * this.grossSales);
  }

  @Override
  public String toString(){
    return String.format(
      "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
      "base-salied commission employee", this.getFirstName(), this.getLastName(),
      "social security number", this.getSocialSecurityNumber(),
      "gross sales", this.getGrossSales(),
      "commission rate", this.getCommissionRate(),
      "base salary", this.getBaseSalary()
    );
  }
}
