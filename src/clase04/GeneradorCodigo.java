package clase04;

public class GeneradorCodigo {
    public int numeroCaracteres = 3;
    public int codigoGenerado;

    public int mostrarNumeroCaracteres(){
        return numeroCaracteres;
    }
    public int mostrarCodigoGenerado(){
        codigoGenerado = (int) (Math.random()*(Math.pow(10,numeroCaracteres)) + (Math.pow(10,numeroCaracteres-1)));
        return codigoGenerado;
    }
}
