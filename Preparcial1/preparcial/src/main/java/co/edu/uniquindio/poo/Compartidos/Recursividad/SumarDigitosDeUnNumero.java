package co.edu.uniquindio.poo.Compartidos.Recursividad;
/*
 Escribe un método recursivo que sume los dígitos de un número.
 */
public class SumarDigitosDeUnNumero {
    public static int sumarDigitos(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + sumarDigitos(n/10);
    }

    public static void main(String[] args) {
        int n = 456;
        System.out.println(sumarDigitos(n));
    }
}
//WillyWilliam
