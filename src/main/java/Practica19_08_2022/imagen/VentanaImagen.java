package Practica19_08_2022.imagen;

import javax.swing.*;
import java.awt.*;

public class VentanaImagen extends JFrame {
    private Imagen modelo;

    public static void main(String[] args) {
        VentanaImagen ventana = new VentanaImagen();
    }

    public VentanaImagen(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        inicializarImagen();
        PanelImagen panel=new PanelImagen(modelo);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(panel, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }

    public void inicializarImagen(){
        modelo = new Imagen(300,300);

        for (int i = 0;i<300;i++){
            modelo.setColor(i,100,255,0,0);
        }
    }
}
