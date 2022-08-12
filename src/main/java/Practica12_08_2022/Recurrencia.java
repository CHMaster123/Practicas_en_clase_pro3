package Practica12_08_2022;

public class Recurrencia {

    public static void main(String[] args) {
       Recurrencia a= new Recurrencia();
       a.Torre_de_Hanoi(1,3,2,3);
            }
    public static int suma(int s){
        if (s == 0) {
            return 0;
        }
        return s + suma(s-1);
    }
    public static int maximo_comun_denominador (int a,int b){
        int aux1 = a % b;

        if (aux1 == 0){
            return b;
        }
        System.out.print(a+" | " );
        System.out.println(b+" |  ... " + aux1);
        return maximo_comun_denominador(b,aux1);
    }
    public static void Torre_de_Hanoi(int de, int a, int pp, int n){
        if (n == 1){
            System.out.println(de + " -> "+a);
            return;
        }
        Torre_de_Hanoi(de,pp,a,n-1);
        Torre_de_Hanoi(de,a,pp,1);
        Torre_de_Hanoi(pp,a,de,n-1);
    }
}
