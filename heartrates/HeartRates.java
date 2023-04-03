// Heart Rates 

public class HeartRates {
  private  String firstname;
  private String lastname;
  private byte birthDay;
  private byte birthMonth;
  private short birthYear;
  
  public HeartRates (String firstname, String lastname, short birthYear, byte birthMonth, byte birthDay) {
	  this.firstname = firstname;
	  this.lastname = lastname;
	  this.birthDay = birthDay;
	  this.birthMonth = birthMonth;
	  this.birthYear = birthYear;
  }
  
  public void setFirstname(String firstname) {
	  this.firstname = firstname;
  }
  
  public void setLastname(String lastname) {
	  this.lastname = lastname;
  }
  
  public void setBirthday(short year, byte month, byte day) {
	  this.birthYear = year;
	  this.birthMonth = month;
	  this.birthDay = day;
  }
  
  public String getFirstname() {
	  return this.firstname;
  }
  
  public String getLastname() {
	  return this.lastname;
  }
  
  public String getBirthday() {
	  return this.birthYear + "-" + this.birthMonth + "-" + this.birthDay;
  }
  
  public int age() {
	  return 2023 - this.birthYear;
  }
  
  public int getMaxHeartRate() {
	  return 220 - age();
  }
  
  public double getHeartRate50() {
	  return getMaxHeartRate() * 50 / 100.;
  }
  
  public double getHeartRate85() {
	  return getMaxHeartRate() * 85 / 100.;
  }
   
  public String toString() {
	  return "Name: " + this.getFirstname() + " " + this.getLastname() + "\n" +
      "Birthday: " + this.getBirthday() + "\n" +
	  "Age: " + this.age() + "\n" +
      "Maximun heart rate: " + this.getMaxHeartRate() + "\n" +
      "Target heart rate: " + this.getHeartRate50() + " - " + getHeartRate85();
  }
}
