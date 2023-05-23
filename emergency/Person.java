public class Person{
  private String firstName;
  private String lastName;
  private String phone;
  private String nature;

  public Person(String firstName, String lastName, String phone, String nature){
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.nature = nature;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setPhone(String phone){
    this.phone = phone;
  }

  public void setNature(String nature){
    this.nature = nature;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public String getPhone(){
    return this.phone;
  }

  public String getNature(){
    return this.nature;
  }

  public String toString(){
    return String.format("Name: %s %s%nPhone: %s%nNature: %s%n", this.getFirstName(), this.getLastName(), this.getPhone(), this.getNature());
  }
}
