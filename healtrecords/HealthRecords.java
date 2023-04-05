// Heart Records 

public class HealthRecords {
  private  String firstname;
  private String lastname;
  private byte birthDay;
  private byte birthMonth;
  private short birthYear;
  private String gender;
  private double height;
  private double weight;
    
  public HealthRecords (String firstname, String lastname, short birthYear, byte birthMonth, byte birthDay, String gender, double height, double weight) {
	  this.firstname = firstname;
	  this.lastname = lastname;
	  this.birthDay = birthDay;
	  this.birthMonth = birthMonth;
	  this.birthYear = birthYear;
	  this.gender = gender;
          this.height = height;
          this.weight = weight;
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

  public void setGender(String gender){
    this.gender = gender;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }
  
  public String getFirstname() {
	  return this.firstname;
  }
  
  public String getLastname() {
	  return this.lastname;
  }

  public String getGender(){
    return this.gender;
  }

  public double getHeight(){
    return this.height;
  }

  public double getWeight(){
    return this.weight;
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

  public double bmi(){
    if (this.height < 1)
      return 0;
    else 
      return this.weight / (this.height * this.height);
  }
   
  public String toString() {
	  return "****Health Record****\n" +
      "Name: " + this.getFirstname() + " " + this.getLastname() + "\n" +
      "Gender: " + this.getGender() + "\n" +
      "Birthday: " + this.getBirthday() + "\n" +
      "Age: " + this.age() + " years\n" +
      "Maximun heart rate: " + this.getMaxHeartRate() + "\n" +
      "Target heart rate: " + this.getHeartRate50() + " - " + getHeartRate85() + "\n" +
      "Weight: " + this.getWeight() + "kg Height: " + this.getHeight() + "m\n" + 
      "BMI: " + String.format("%.2f", this.bmi());
  }
}
