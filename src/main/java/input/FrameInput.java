package src.patrones.input;

import javax.swing.JOptionPane;

public class FrameInput implements Input {
    @Override
    public Object getData() {
        return JOptionPane.showInputDialog(null, "Ingresa los datos:");
    }
}
