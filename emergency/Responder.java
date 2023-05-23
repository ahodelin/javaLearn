public enum Responder{
  POL("Police"),
  AMB("Ambulance"),
  FIR("Fire department");

  private final String responder;

  Responder(String r){
    this.responder = r;
  }

  public String getResponder(){
    return responder;
  }
}
