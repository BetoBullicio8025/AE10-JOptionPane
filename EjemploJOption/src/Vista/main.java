package Vista;

import Controlador.ControladorEjemplo;

public class main {
    public static void main(String[] args) {
        Ventana ventana1 = new Ventana("Ejemplo JOptionPane");

        ControladorEjemplo controller = new ControladorEjemplo(ventana1);
    }
}
