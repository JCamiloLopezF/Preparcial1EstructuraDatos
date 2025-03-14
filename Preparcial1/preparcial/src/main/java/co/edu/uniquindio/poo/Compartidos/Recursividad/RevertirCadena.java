package co.edu.uniquindio.poo.Compartidos.Recursividad;

/*
 Crea una función recursiva que invierta una cadena de texto.
 */
public class RevertirCadena {
    public static void main (String[] args){
        String str = "Just friends";
        reverseString(str);
    }

    public static void reverseString(String str){
        if(str.length() == 0){
            return;
        }
        System.out.print(str.charAt(str.length()-1));
        reverseString(str.substring(0, str.length()-1));
    }
}
