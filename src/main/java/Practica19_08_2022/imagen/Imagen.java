package Practica19_08_2022.imagen;

import java.awt.*;

public class Imagen {
    private int ancho;
    private int alto;
    private int[][] pixeles;

    public Imagen(int ancho,int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.pixeles = new int[ancho][alto];
    }

    public void setColor(int ancho, int alto, int R,int G,int B){
        // SE DECLARA QUE EN LA POSICION R = 0000 0000 0000 0000 0101 0101,  SE JUNTA CON LAS POSICIONES G = 0000 0000 1010 1010 0000 0000, MOVIDO 8 POSICIONES
        // LO MISMO CON B, CON LA OPERACION | QUE ES LA CONDICION ¨OR¨ PARA QUE PUEDA JUNTAR LOS BITS CREANDO EL INT DE COLOR EN LA POSICION DECLARADA
        int color = B |(G<<8)| (R<<16);
        this.pixeles[ancho][alto] = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int[][] getPixeles() {
        return pixeles;
    }

    public void setPixeles(int[][] pixeles) {
        this.pixeles = pixeles;
    }

    public void dibujar(Graphics g){
        for (int i = 0; i<ancho; i++){
            for (int j = 0; j<alto;j++){
             g.setColor(new Color(pixeles[i][j]));
             g.drawLine(i,j,i,j);

            }
        }
    }

}
