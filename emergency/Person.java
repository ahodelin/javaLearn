import java.security.SecureRandom;

public class Person{
  private String firstName;
  private String lastName;
  private String phone;
  private static final int NATURES = 3;
  private final SecureRandom randomNature = new SecureRandom();
  private Nature nature;


  public Person(String firstName, String lastName, String phone){
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;

    int n = randomNature.nextInt(NATURES);

    switch(n){
      case 0:
        this.nature = Nature.CR;
        break;
      case 1:
        this.nature = Nature.ME;
        break;
      case 2:
        this.nature = Nature.FI;
        break;
    }

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

  public String getNature(){
    return this.nature.getNature();
  }

  public Nature getNatureKey(){
    return this.nature;
  }
  public String toString(){
    return String.format("Name: %s %s%nPhone: %s%nNature: %s%n", this.getFirstName(), this.getLastName(), this.getPhone(), this.getNature());
  }
}
