import javax.swing.*;

// Definición de la clase BMIApp con interfaz gráfica de usuario
public class BMIApp {
    public static void main(String[] args) {
        // Creación de la ventana principal
        JFrame frame = new JFrame("Calculadora de BMI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Creación de componentes de la interfaz gráfica
        JTextField pesoField = new JTextField(10);
        JTextField alturaField = new JTextField(10);
        JButton calcularButton = new JButton("Calcular");
        JLabel resultadoLabel = new JLabel();
        JLabel categoriaLabel = new JLabel();

        // Configuración del botón de cálculo
        calcularButton.addActionListener(e -> {
            // Obtención de los datos ingresados por el usuario
            double peso = Double.parseDouble(pesoField.getText());
            double altura = Double.parseDouble(alturaField.getText());

            // Creación de un objeto BMI
            BMI bmi = new BMI(peso, altura);

            // Cálculo del BMI y obtención de la categoría
            double resultado = bmi.calcularBMI();
            String categoria = bmi.obtenerCategoria(resultado);

            // Actualización de las etiquetas de resultado y categoría
            resultadoLabel.setText("Tu BMI es: " + resultado);
            categoriaLabel.setText("Tu categoría de BMI es: " + categoria);
        });

        // Agregado de componentes a la ventana
        frame.add(new JLabel("Ingresa tu peso en kilogramos:"));
        frame.add(pesoField);
        frame.add(new JLabel("Ingresa tu altura en metros:"));
        frame.add(alturaField);
        frame.add(calcularButton);
        frame.add(resultadoLabel);
        frame.add(categoriaLabel);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}

// Resto del código de la clase BMI (sin cambios)
class BMI {
    private double peso;
    private double altura;

    public BMI(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularBMI() {
        return peso / (altura * altura);
    }

    public String obtenerCategoria(double bmi) {
        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Peso normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Sobrepeso";
        } else if (bmi >= 30 && bmi < 34.9) {
            return "Obesidad Clase 1 (Moderada)";
        } else if (bmi >= 35 && bmi < 39.9) {
            return "Obesidad Clase 2 (Severa)";
        } else {
            return "Obesidad Clase 3 (Muy severa o mórbida)";
        }
    }
}

