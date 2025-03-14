package co.edu.uniquindio.poo.Compartidos.Recursividad;

/*
Escribe un método recursivo que calcule el factorial de un número entero n.
 */

public class Factorial {

    public static int calcularFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n * calcularFactorial(n-1);
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(calcularFactorial(n));
    }
}
//Willy william