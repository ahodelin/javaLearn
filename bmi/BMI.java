public class BMI{
  
  private double height;
  private double weight;

  public BMI(){}
 
  public BMI(double weight, double height){
    this.height = height;
    this.weight = weight;  
  }

  public void setHeight(double height){
    this.height = height;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public double getHeight(){
    return this.height;
  }

  public double getWeight(){
    return this.weight;
  }

  public double getBmi(){
    if(this.height > 0)
      return this.weight / (this.height * this.height);
    else
      return 0;
  }

  public String getBmiStatus(){
    if (this.getBmi() > 0 && this.getBmi() < 18.5)
      return "Underweight";
    else if (this.getBmi() >= 18.5 && this.getBmi() <= 24.9)
      return "Normal weight";
    else if (this.getBmi() > 24.9 && this.getBmi() <= 29.9)
      return "Overweight";
    else if (this.getBmi() > 29.9)
      return "Obesity";
    else return "Error";

  }

  public  String toString(){
    return "Weight: " + this.getWeight() + "\n" +
      "Height: " + this.getHeight() + "\n" +
      "BMI: " + getBmi() + "\n" +
      "Status: " + getBmiStatus();
  }
}
