package co.edu.uniquindio.poo.Compartidos.EjerciciosEstructuras;

import java.util.HashMap;
import java.util.Iterator;

/*
🗳️ Contexto: En una elección en línea, cada usuario solo puede votar una vez por su candidato preferido. Debes almacenar los votos y asegurarte de que un usuario no pueda votar más de una vez.*/
public class Votaciones {

    public static void main(String[] args) {
        HashMap<String, String> votos = new HashMap<>();
        votos.put("Juan", "Candidato1");
        votos.put("Pedro", "Candidato2");
        votos.put("Maria", "Candidato3");
        votos.put("Juan", "Candidato4");
        votos.put("Pablo", "Candidato2");

        Iterator<String> it = votos.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println("Usuario: " + key + " Voto por: " + votos.get(key));
        }
    } 
}
//don pablo