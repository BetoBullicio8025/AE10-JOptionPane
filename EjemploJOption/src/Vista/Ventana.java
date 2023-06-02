package Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton vntMensaje;
    private JButton vntEntrada;
    private JButton vntOpcion;
    private JLabel lblResultado;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(450, 200);
        vntMensaje = new JButton("Mensaje");
        vntEntrada = new JButton("Entrada");
        vntOpcion = new JButton("Opcion");
        lblResultado = new JLabel("Resultado");

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(vntMensaje);
        this.getContentPane().add(vntEntrada);
        this.getContentPane().add(vntOpcion);
        this.getContentPane().add(lblResultado);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JButton getVntMensaje() {
        return vntMensaje;
    }

    public void setVntMensaje(JButton vntMensaje) {
        this.vntMensaje = vntMensaje;
    }

    public JButton getVntEntrada() {
        return vntEntrada;
    }

    public void setVntEntrada(JButton vntEntrada) {
        this.vntEntrada = vntEntrada;
    }

    public JButton getVntOpcion() {
        return vntOpcion;
    }

    public void setVntOpcion(JButton vntOpcion) {
        this.vntOpcion = vntOpcion;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public void setLblResultado(JLabel lblResultado) {
        this.lblResultado = lblResultado;
    }
}
