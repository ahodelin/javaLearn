public class Emergency{
  // public static 
  private Person person;
  private Address address;
  private Location location;
  private Time time;
//  private

  public Emergency (Person p, Address a, Location l, Time t){
    this.person = p;
    this.address = a;
    this.location = l;
    this.time = t;
  }

   public String toString(){
     return "" + this.person + this.address + this.location + "Time: " + this.time;
   }
}
