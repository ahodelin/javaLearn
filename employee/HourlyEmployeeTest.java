public class HourlyEmployeeTest{
  public static void main(String[] args){
    HourlyEmployee employee = new HourlyEmployee(
      "Sue", "Jones", "222-222-2222", 4, 5
    );

    System.out.println("Employee information obtained by get methods:");
   
    System.out.printf("%n%s %s%n", "First name ist", employee.getFirstName());

    System.out.printf("%s %s%n", "Last name is", employee.getLastName());

    System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());

    System.out.printf("%s %.2f%n", "Hours", employee.getHours());

    System.out.printf("%s %.2f%n", "Wages", employee.getWages());

    employee.setHours(8);
    employee.setWages(6);

    System.out.printf("%n%s:%n%n%s%n", "Updated employee infomation obtained by toString", employee);
  }
}
