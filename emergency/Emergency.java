public class Emergency{
  // public static 
  private Person person;
  private Address address;
  private Location location;
  private Time time;
//  private

  public Emergency (Person p, Address a, Location l, Time t){
    p = new Person("Pepito", "El Loco", "443025");
    this.person = p;

    a = new Address("Test City", "La calle del medio", "55331", "Edificio Foxa", "4");
    this.address = a;

    l = new Location(24.2, 54.6);
    this.location = l;

    t = new Time(23, 44, 53);
    this.time = t;
  }

   public String toString(){
     return "" + this.person + this.address + this.location + this.time;
   }
}
