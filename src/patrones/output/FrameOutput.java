package src.patrones.output;

import javax.swing.JOptionPane;

public class FrameOutput implements Output {
    @Override
    public void sendData(Object data) {
        JOptionPane.showMessageDialog(null, "Mostrando: " + data);
    }

    @Override
    public void showData(Object data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
