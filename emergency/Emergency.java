import java.security.SecureRandom;

public class Emergency{
  // public static 
  private Person person;
  private Address address;
  private Location location;
  private Time time;
  private static final int RESPONDERS = 3;
  private final SecureRandom randomResponder = new SecureRandom();
  private Responder responder;
  
//  private

  public Emergency (Person p, Address a, Location l, Time t){
    this.person = p;
    this.address = a;
    this.location = l;
    this.time = t;

    int r = randomResponder.nextInt(RESPONDERS);

    switch(r){
      case 0:
        this.responder = Responder.POL;
        break;
      case 1:
        this.responder = Responder.AMB;
        break;
      case 2:
        this.responder = Responder.FIR;
        break;
    }
    
  }

   public String toString(){
     return "" + this.person + this.address + this.location + "Time: " + this.time + "\nResponder: " + this.responder.getResponder();
   }
}
