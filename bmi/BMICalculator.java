public class BMICalculator{
  
  private double height;
  private double weight;

  public BMICalculator(){}
 
  public BMICalculator(double weight, double height){
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

  public  String toString(){
    return "BMI: " + getBmi();
  }
}
