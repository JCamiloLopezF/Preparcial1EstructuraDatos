package co.edu.uniquindio.poo.Compartidos.EjerciciosEstructuras;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*📚 Contexto: En una universidad, los estudiantes se inscriben en cursos. Un estudiante no puede inscribirse dos veces en el mismo curso. Se debe permitir agregar, eliminar y listar los estudiantes inscritos en orden de inscripción.
 
MILO
 */
public class Inscripciones {
    public static void main(String[] args) {
        Curso clase = new Curso("Programación", 1);
        Curso clase2 = new Curso("Matemáticas", 2);
        Curso clase3 = new Curso("Física", 3);
        Estudiante estudiante = new Estudiante("Juan");
        Estudiante estudiante2 = new Estudiante("Pedro");
        Estudiante estudiante3 = new Estudiante("Maria");
        Estudiante estudiante4 = new Estudiante("Ana");
        Set<Estudiante> estudiantes = new LinkedHashSet<>();
        estudiantes.add(estudiante);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);

        estudiante.inscribirCurso(clase);
        estudiante.inscribirCurso(clase2);
        estudiante.inscribirCurso(clase3);
        estudiante.inscribirCurso(clase3);

        estudiante2.inscribirCurso(clase);
        estudiante2.inscribirCurso(clase2);

        estudiante3.inscribirCurso(clase);
        estudiante3.inscribirCurso(clase2);

        estudiante4.inscribirCurso(clase);
        estudiante4.inscribirCurso(clase2);
        estudiante4.inscribirCurso(clase3);

        listarEstudiantes(estudiantes);


    }

    public static void listarEstudiantes(Set<Estudiante> estudiantes){
        Iterator<Estudiante> iterador = estudiantes.iterator();
        while(iterador.hasNext()){
            Estudiante estudiante = iterador.next();
            System.out.println(estudiante.nombre);

        Iterator<Curso> iteradorCursos = estudiante.cursos.iterator();
        while(iteradorCursos.hasNext()){
            Curso curso = iteradorCursos.next();
            System.out.println("Curso: " + curso.nombre);
        }
        }
    }

    public static class Curso{
        public String nombre;
        public int id;
        public Curso(String nombre, int id) {
            this.nombre = nombre;
            this.id = id;
        }
    }

    public static class Estudiante{
        public String nombre;
        public Set<Curso> cursos;

        public Estudiante(String nombre) {
            this.nombre = nombre;
            this.cursos = new LinkedHashSet<>();
        }

        public void inscribirCurso(Curso curso){
            if(cursos.add(curso)){
                System.out.println(nombre + " se registró en el curso: " + curso.nombre);
            }else{
                System.out.println(nombre + " ya está inscrito en el curso: " + curso.nombre);
            }
        }

        public void cancelarCurso(Curso curso){
            if(cursos.remove(curso)){
                System.out.println(nombre + " canceló el curso: " + curso.nombre);
            }else{
                System.out.println(nombre + " no está inscrito en el curso: " + curso.nombre);
            }
        }
    }
}
