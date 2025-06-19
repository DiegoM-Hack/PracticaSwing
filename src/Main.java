
import javax.swing.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            hola frame = new hola();
            frame.setVisible(true);
        });
    }
}