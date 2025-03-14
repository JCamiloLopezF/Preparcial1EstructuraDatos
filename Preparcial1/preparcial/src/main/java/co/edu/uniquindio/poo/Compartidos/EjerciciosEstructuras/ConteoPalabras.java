package co.edu.uniquindio.poo.Compartidos.EjerciciosEstructuras;

import java.util.HashMap;
import java.util.Iterator;

/*📝 Contexto: Estás desarrollando un software para analizar documentos de texto. Se necesita contar cuántas veces aparece cada palabra en un documento de varias páginas. 
 MILO
*/
public class ConteoPalabras {
    public static void main(String[] args) {
        String texto = "La recursividad es un concepto fundamental en la programación que permite que una función se llame a sí misma para resolver problemas de manera más elegante y estructurada.";

        contarPalabras(texto);

}

    public static void contarPalabras(String texto){
        texto = texto.toLowerCase();
        String[] caracteres = texto.split(" ");
        HashMap<String, Integer> palabras = new HashMap<>();
        Iterator<String> iterador = palabras.keySet().iterator();
        while(iterador.hasNext()){
            String palabra = iterador.next();
            if(palabras.containsKey(palabra)){
                palabras.put(palabra, palabras.get(palabra) + 1);
            }
        }
    }
}