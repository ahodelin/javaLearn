public enum Nature{
  FI("Fire"),
  ME("Medical"),
  CR("Crime");

  private final String nature;

  Nature(String n){
    this.nature = n;
  }

  public String getNature(){
    return nature;
  }
}
