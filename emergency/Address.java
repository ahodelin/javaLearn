public class Address{
  private String city;
  private String street;
  private String zip;
  private String building;
  private String number;

  public Address(){
    this("", "", "", "", "");
  }
  
  public Address(String city){
    this(city, "", "", "", "");
  }

  public Address(String city, String street){
    this(city, street, "", "", "");
  }

  public Address(String city, String street, String zip){
    this(city, street, zip, "", "");
  }

  public Address(String city, String street, String zip, String building){
    this(city, street, zip, building, "");
  }

  public Address(String city, String street, String zip, String building, String number){
    this.city = city;
    this.street = street;
    this.zip = zip;
    this.building = building;
    this.number = number;
  }

  public void setCity(String city){
    this.city = city;
  }

  public void setStreet(String street){
    this.street = street;
  }

  public void setZip(String zip){
    this.zip = zip;
  }

  public void setBuilding(String building){
    this.building = building;
  }

  public void setNuber(String number){
    this.number = number;
  }

  public String getCity(){
    return this.city;
  }

  public String getStreet(){
    return this.street;
  }

  public String getZip(){
    return this.zip;
  }

  public String getBuilding(){
    return this.building;
  }

  public String getNumber(){
    return this.number;
  }

  public String toString(){
    return String.format("City: %s%nStreet: %s%nZip: %s%nBuilding: %s%nNumber: %s%n", 
      this.getCity(), this.getStreet(), this.getZip(), 
      this.getBuilding(), this.getNumber()
    );
  }
}
