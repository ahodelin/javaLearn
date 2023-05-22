public class Location{
  private double latitude;
  private double longitude;

  public Location(double lat, double lon){
    this.latitude = lat;
    this.longitude = lon;
  }

  public void setLatitude(double lat){
    this.latitude = lat;
  }

  public void setLongitude(double lon){
    this.longitude = lon;
  }

  public double getLatitude(){
    return this.latitude;
  }

  public double getLongitude(){
    return this.longitude;
  }

  public String toString(){
    return String.format("latitude: %f %nlongitude: %f%n", this.getLatitude(), getLongitude());
  }
}
