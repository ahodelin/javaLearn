public class Person{
  private String firstName;
  private String lastName;
  private String phone;

  public Person(String firstName, String lastName, String phone){
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
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

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public String getPhone(){
    return this.phone;
  }

  public String toString(){
    return String.format("Name: %s %s%nPhone: %s%n", this.getFirstName(), this.getLastName(), this.getPhone());
  }
}
