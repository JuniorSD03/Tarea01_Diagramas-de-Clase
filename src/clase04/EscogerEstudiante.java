package clase04;

public class EscogerEstudiante {
    public int numeroEstudiantes = 34;
    public int estudianteEscogido;

    public int mostrarNumEstudiantes(){
        return numeroEstudiantes;
    }
    public int mostrarEstudianteEscogido(){
        estudianteEscogido = (int) (Math.random()*(numeroEstudiantes) + 1);
        return estudianteEscogido;
    }
}
