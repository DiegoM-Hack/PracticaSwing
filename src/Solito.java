import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solito extends JFrame {
    private JPanel panel1;
    private JPanel Principal;
    private JTextField Ingresa;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton accion1Button;
    private JButton accion2Button;
    private JLabel resultadoLabel;
    private JLabel lblResultado;
    private JPanel contentPane;
    private JTextField txtNombre;

    public Solito() {
        setTitle("Mi Formulario ");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Principal);
        setVisible(true);


        accion1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos = recolectarDatos();
                JOptionPane.showMessageDialog(null, datos, "Datos Ingresados", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        accion2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos = "<html>" + recolectarDatos().replaceAll("\n", "<br>") + "</html>";
                resultadoLabel.setText(datos);
            }
        });
    }
    private String recolectarDatos() {
        String nombre = Ingresa.getText();
        String apellido = textField1.getText();
        String direccion = textField2.getText();
        String telefono = textField3.getText();
        String anioNacimiento = textField4.getText();
        String estatura = textField5.getText();

        return "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Dirección: " + direccion + "\n"
                + "Teléfono: " + telefono + "\n"
                + "Año de Nacimiento: " + anioNacimiento + "\n"
                + "Estatura: " + estatura;
    }


    public static void main(String[] args) {
        Solito dialog = new Solito();
        dialog.setVisible(true);

    }
}
