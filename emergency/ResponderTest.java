public class ResponderTest{
  public static void main(String[] args){
    for(Responder responder : Responder.values())
      System.out.printf("%-10s%-45s%n",
        responder, responder.getResponder()
      );
    Responder r = Responder.POL;
    System.out.printf("Key: %s Name: %s%n", r, r.getResponder());
  }
}
