import java.security.SecureRandom;


public class Emergency{
  private Person person;
  private Address address;
  private Location location;
  private Time time;
  private Responder responder;
  private final SecureRandom randomStatus = new SecureRandom();
  private final String[] status = {"to do", "going", "in progress", "redy"};
  private int intStatus;

  public Emergency (Person p, Address a, Location l, Time t){
    this.person = p;
    this.address = a;
    this.location = l;
    this.time = t;

    this.intStatus = randomStatus.nextInt(status.length);



    switch(this.person.getNatureKey()){
      case CR:
        this.responder = Responder.POL;
        break;
      case ME:
        this.responder = Responder.AMB;
        break;
      case FI:
        this.responder = Responder.FIR;
        break;
    }
    
  }

   public String toString(){
     return "" + this.person + this.address + this.location + "Time: " + this.time + "\nResponder: " + this.responder.getResponder() + "\nStatus: " + this.status[this.intStatus] ;
   }
}
