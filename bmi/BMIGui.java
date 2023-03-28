import javax.swing.JOptionPane;

public class BMIGui{
  public static void main(String[] args){
    String hStr = JOptionPane.showInputDialog("Height");
    double h = Double.parseDouble(hStr);
   
    String wStr = JOptionPane.showInputDialog("Weight");
    double w = Double.parseDouble(wStr);

    double bmi = w / (h * h);
    String message = String.format("BMI: %f", bmi);

    JOptionPane.showMessageDialog(null, message);
  }
}
