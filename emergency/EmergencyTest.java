public class EmergencyTest{
  public static void main(String[] args){

    Person p = new Person("Pepito", "El Loco", "443025", "asesinato");

    Address a = new Address("Test City", "La calle del medio", "55331", "Edificio Foxa", "4");

    Location l = new Location(24.2, 54.6);

    Time t = new Time(23, 44, 53);

    Emergency e = new Emergency(p, a, l, t);

    System.out.println(e);
  }
}
