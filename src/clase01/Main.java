package clase01;

public class Main {
    public static void main(String args[])
    {
        Colegio colegio = new Colegio();
        Docente docente = new Docente();
        Estudiante estudiante = new Estudiante();
        Portero portero = new Portero();

        System.out.println("COLEGIO");
        System.out.println("Nombre: "+ colegio.mostrarNombre());
        System.out.println("Codigo: "+ colegio.mostrarCodigo());
        System.out.println("Modalidad: "+ colegio.mostrarModalidad());
        System.out.println("Genero de los estudiantes: "+ colegio.mostrarGeneroDeEstudiantes());

        System.out.println("\nDOCENTE");
        System.out.println("Nombre: "+ docente.mostrarNombre());
        System.out.println("Grado y Sección: "+ docente.mostrarCurso());
        System.out.println("Edad: "+ docente.mostrarEdad());

        System.out.println("\nESTUDIANTE");
        System.out.println("Nombre: "+ estudiante.mostrarNombre());
        System.out.println("Edad: "+ estudiante.mostrarEdad());
        System.out.println("Grado y Sección: "+ estudiante.mostrarGradoSeccion());

        System.out.println("\nPORTERO");
        System.out.println("Nombre: "+ portero.mostrarNombre());
        System.out.println("Turno: "+ portero.mostrarTurno());
        System.out.println("Hora de ingreso: "+ portero.mostrarIngreso());
        System.out.println("Hora de salida: " + portero.mostrarSalida());

    }
}
