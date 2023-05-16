public class Employee{
  private String firstName;
  private String lastName;
  private static int count = 0;

  public Employee(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;

    ++count;
    System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public static int getCount(){
    return count;
  }

  public String toString(){
    return String.format("%s, %s", lastName, firstName);
  }
}
