package co.edu.uniquindio.poo.Preparcial1.Ejercicio1;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        String[] lista = {"Hola", "Mundo", "Java", "POO", "Uniquindio"};
        MiLista miLista = new MiLista(lista, lista.length);
        
        for (String elemento : miLista) {
            System.out.println(elemento);
        }
    }
}
