package Practica19_08_2022.imagen;

import javax.swing.*;
import java.awt.*;

public class PanelImagen extends JPanel {
    private Imagen modelo;

    public PanelImagen(Imagen imagen){
        this.modelo= imagen;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(modelo.getAncho(),modelo.getAlto());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(modelo ==null){
            return;
        }
        modelo.dibujar(g);
    }
}
