package co.edu.uniquindio.poo.Compartidos.Recursividad;

/*
 Crea un método recursivo que determine si una palabra es un palíndromo.
 MILO
 */

public class Palindromo {
    public static void main(String[] args){
        String palabra = "ana";
        System.out.println(esPalindromo(palabra));
    }
    public static boolean esPalindromo(String palabra){
        if(palabra.length() == 0 || palabra.length() == 1){
            return true;
        }
        if(palabra.charAt(0) == palabra.charAt(palabra.length()-1)){
            return esPalindromo(palabra.substring(1, palabra.length()-1));
        }
        else{
            return false;
        }
    }
}
