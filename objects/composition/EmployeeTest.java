public class EmployeeTest{
  public static void main(String[] args){
    Date birth = new Date(11, 25, 1980);
    Date hire = new Date(5, 12, 2019);

    Employee employee = new Employee("Abel", "Hodelin Hernandez", birth, hire);

    System.out.println(employee);
  }
}
