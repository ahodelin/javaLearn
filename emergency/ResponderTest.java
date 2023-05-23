public class ResponderTest{
  public static void main(String[] args){
    for(Responder responder : Responder.values())
      System.out.printf("%-10s%-45s%n",
        responder, responder.getResponder()
      );

    for(Responder responder : Responder.values())
      System.out.printf("%s%n", responder);
  }
}
