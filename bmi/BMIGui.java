import javax.swing.*;

// Definición de la clase BMIApp con interfaz gráfica de usuario
public class BMIGui {
    public static void main(String[] args) {
        // Creación de la ventana principal
        JFrame frame = new JFrame("BMI Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Creación de componentes de la interfaz gráfica
        JTextField weightField = new JTextField(5);
        JTextField heightField = new JTextField(5);
        JButton calcularButton = new JButton("Calc");
        JLabel resultLabel = new JLabel();
        //JLabel categoryLabel = new JLabel();

        // Configuración del botón de cálculo
        calcularButton.addActionListener(e -> {
            // Obtención de los datos ingresados por el usuario
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            // Creación de un objeto BMI
            BMI bmi = new BMI(weight, height);

            // Cálculo del BMI y obtención de la categoría
          //  double result = bmi.calcularBMI();
           // String category = bmi.obtenerCategoria(result);

            // Actualización de las etiquetas de result y categoría
            resultLabel.setText(bmi.toStringGui());
            //categoryLabel.setText("Tu categoría de BMI es: " + category);
        });

        // Agregado de componentes a la ventana
        frame.add(new JLabel("Insert your weight in kilograms:"));
        frame.add(weightField);
        frame.add(new JLabel("Insert your height in meters:"));
        frame.add(heightField);
        frame.add(calcularButton);
        frame.add(resultLabel);
        // frame.add(categoryLabel);

        // Mostrar la ventana
        frame.setVisible(true);
    }
} 
