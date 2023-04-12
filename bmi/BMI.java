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

  public String getBmiStatus(double bmi){
    if (bmi > 0 && bmi < 18.5)
      return "Underweight";
    else if (bmi >= 18.5 && bmi <= 24.9)
      return "Normal weight";
    else if (bmi > 24.9 && bmi <= 29.9)
      return "Overweight";
    else if (bmi > 29.9)
      return "Obesity";
    else return "Error";

  }

  public  String toString(){
    return "Weight: " + this.getWeight() + "\n" +
      "Height: " + this.getHeight() + "\n" +
      "BMI: " + String.format("%.2f", this.getBmi()) + "\n" +
      "Status: " + getBmiStatus(this.getBmi());
  }

  public  String toStringGui(){
    return "<html>Weight: " + this.getWeight() + "<br>" +
      "Height: " + this.getHeight() + "<br>" +
      "BMI: " + String.format("%.2f", this.getBmi()) + "<br>" +
      "Status: " + getBmiStatus(this.getBmi()) + "</html>";
  }

}
