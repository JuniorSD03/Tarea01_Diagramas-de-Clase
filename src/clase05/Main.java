package clase05;

public class Main {
    public static void main(String[] args) {
        CursoCalculo cursoCalculo = new CursoCalculo();
        CursoEstadistica cursoEstadistica = new CursoEstadistica();
        CursoProgramacion cursoProgramacion = new CursoProgramacion();
        CursoDatos cursoDatos = new CursoDatos();
        CursoRedes cursoRedes = new CursoRedes();
        CursoAnalisisSistemas cursoAnalisisSistemas = new CursoAnalisisSistemas();
        CursoSistemas cursoSistemas = new CursoSistemas();

        System.out.println("HORARIO DE CLASES");
        System.out.println("\nCurso: " + cursoCalculo.mostrarNombre() + " " + cursoCalculo.mostrarNivel());
        System.out.println("docente: " + cursoCalculo.mostrarDocente());
        System.out.println("Ciclo: " + cursoCalculo.mostrarCiclo());
        System.out.println("Horario: " + cursoCalculo.mostrardias());

        System.out.println("\nCurso: " + cursoEstadistica.mostrarNombre() + " " + cursoEstadistica.mostrarNivel());
        System.out.println("docente: " + cursoEstadistica.mostrarDocente());
        System.out.println("Ciclo: " + cursoEstadistica.mostrarCiclo());
        System.out.println("Horario: " + cursoEstadistica.mostrardias());

        System.out.println("\nCurso: " + cursoProgramacion.mostrarNombre() + " " + cursoProgramacion.mostrarNivel());
        System.out.println("docente: " + cursoProgramacion.mostrarDocente());
        System.out.println("Ciclo: " + cursoProgramacion.mostrarCiclo());
        System.out.println("Horario: " + cursoProgramacion.mostrardias());

        System.out.println("\nCurso: " + cursoDatos.mostrarNombre() + " " + cursoDatos.mostrarNivel());
        System.out.println("docente: " + cursoDatos.mostrarDocente());
        System.out.println("Ciclo: " + cursoDatos.mostrarCiclo());
        System.out.println("Horario: " + cursoDatos.mostrardias());

        System.out.println("\nCurso: " + cursoRedes.mostrarNombre() + " " + cursoRedes.mostrarNivel());
        System.out.println("docente: " + cursoRedes.mostrarDocente());
        System.out.println("Ciclo: " + cursoRedes.mostrarCiclo());
        System.out.println("Horario: " + cursoRedes.mostrardias());

        System.out.println("\nCurso: " + cursoAnalisisSistemas.mostrarNombre() + " " + cursoAnalisisSistemas.mostrarNivel());
        System.out.println("docente: " + cursoAnalisisSistemas.mostrarDocente());
        System.out.println("Ciclo: " + cursoAnalisisSistemas.mostrarCiclo());
        System.out.println("Horario: " + cursoAnalisisSistemas.mostrardias());

        System.out.println("\nCurso: " + cursoSistemas.mostrarNombre() + " " + cursoSistemas.mostrarNivel());
        System.out.println("docente: " + cursoSistemas.mostrarDocente());
        System.out.println("Ciclo: " + cursoSistemas.mostrarCiclo());
        System.out.println("Horario: " + cursoSistemas.mostrardias());
    }
}
