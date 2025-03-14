package co.edu.uniquindio.poo.Compartidos.EjerciciosEstructuras;

import java.util.ArrayDeque;

/*🌐 Contexto: Estás implementando el historial de un navegador web. El usuario debe poder retroceder y avanzar en la navegación (como con los botones de "atrás" y "adelante").*/
public class NavegacionWeb {

    public ArrayDeque<String> historial = new ArrayDeque<String>();
    public ArrayDeque<String> adelante = new ArrayDeque<String>();
    public ArrayDeque<String> atras = new ArrayDeque<String>();
    public String paginaActual;

    public void visitarPagina(String pagina){
        if (paginaActual != null) {
            atras.push(paginaActual);
        }
        historial.push(pagina);
        paginaActual = pagina;
        adelante.clear();
    }

    public void paginaAnterior(){
        if(atras != null){
            adelante.push(paginaActual);
            paginaActual = atras.pop();
        }else{
            System.out.println("No hay páginas atrás");
        }
    }

    public void paginaSiguiente(){
        if(adelante != null){
            atras.push(paginaActual);
            paginaActual = adelante.pop();
        }else{
            System.out.println("No hay páginas adelante");
        }
    }

    public static void main(String[] args) {
        NavegacionWeb navegador = new NavegacionWeb();
        navegador.visitarPagina("www.google.com");
        navegador.visitarPagina("www.youtube.com");
        navegador.visitarPagina("www.facebook.com");
        navegador.paginaAnterior();
        navegador.paginaAnterior();
        System.out.println(navegador.paginaActual);
        navegador.paginaSiguiente();
        System.out.println(navegador.paginaActual);
    }
}
//don pablo
