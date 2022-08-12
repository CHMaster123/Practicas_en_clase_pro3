package Practica12_08_2022;

public class Recurrencia {

    public static void main(String[] args) {
        int  aux = 0;
        System.out.println(suma(100));
    }
    public static int suma(int s){
        if (s == 0) {
            return 0;
        }
        return s + suma(s-1);
    }
}
