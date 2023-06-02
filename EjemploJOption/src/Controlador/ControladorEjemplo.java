package Controlador;

import Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class ControladorEjemplo extends MouseAdapter {
    private Ventana view;

    public ControladorEjemplo(Ventana view) {
        this.view = view;
        this.view.getVntMensaje().addMouseListener(this);
        this.view.getVntEntrada().addMouseListener(this);
        this.view.getVntOpcion().addMouseListener(this);
    }
    ImageIcon icono = new ImageIcon("Exito.png");
    public void mouseClicked(MouseEvent e){
        if (e.getSource() == view.getVntMensaje());{
            //System.out.println("Mensaje");
            JOptionPane.showMessageDialog(view,"Hola desde el ejemplo",
                    "Titulo personalizado", JOptionPane.WARNING_MESSAGE,icono);
        }

        if (e.getSource() == view.getVntEntrada());{
            //System.out.println("Entrada");
            String datos = JOptionPane.showInputDialog(view, "Ejemplo de input", "titulo personalizado", JOptionPane.QUESTION_MESSAGE);
            this.view.getLblResultado().setText(datos);
        }

        if (e.getSource() == view.getVntOpcion());{
           // System.out.println("Opcion");
            int resp = JOptionPane.showConfirmDialog(view, "¿Estas seguro de borrar el registro?",
                    "Confirmacion",
                    JOptionPane.YES_NO_OPTION);

            if (resp == JOptionPane.YES_NO_OPTION){
                view.getLblResultado().setText("Elegiste opcion si");
            }else {
                view.getLblResultado().setText("Elegiste la opcion no");

            }



        }
    }




}
