package co.edu.uniquindio.poo.Compartidos.Recursividad;

public class Fibonacci {

    public static int findFibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        return findFibonacci(n-1) + findFibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(findFibonacci(6));
    }
}
