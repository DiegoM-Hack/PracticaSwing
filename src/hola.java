import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;

public class hola extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblResultado;
    public hola() {
        setTitle("Formulario de Saludo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200); // posición y tamaño de la ventana

        contentPane = new JPanel();
        contentPane.setLayout(null); // layout absoluto (como usa un diseñador visual)
        setContentPane(contentPane);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 60, 25);
        contentPane.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(100, 30, 200, 25);
        contentPane.add(txtNombre);

        btnSaludar = new JButton("Saludar");
        btnSaludar.setBounds(100, 70, 100, 30);
        contentPane.add(btnSaludar);

        lblResultado = new JLabel("");
        lblResultado.setBounds(100, 110, 250, 25);
        contentPane.add(lblResultado);

        // Acción del botón
        btnSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                lblResultado.setText("Hola, " + nombre + "!");
            }
        });
}}
