package co.edu.uniquindio.poo.Preparcial1.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        //Crear una matriz de enteros
        Integer[][] matrizEnteros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    }

    public static void mostrarTranspuesta(Integer[][] matriz, int i, int j){
        if(i >= matriz.length){
            return;
        }
        if(j >= matriz.length){
            System.out.println(" ");
            mostrarTranspuesta(matriz, i + 1, 0);
            return;
        }
        System.out.print(matriz[j][i] + " ");
        mostrarTranspuesta(matriz, i, j + 1);

    }
}
