package clase04;

public class ConvertirTiempo {
    public String tipo = "Minutos a Segundos";
    public int minutos = 15;
    private int segEnMin = 60;
    public int segundos;

    public String mostrarTipo(){
        return tipo;
    }
    public int mostrarMinutos(){
        return minutos;
    }
    public int mostrarSegundos(){
        segundos=segEnMin*minutos;
        return segundos;
    }
}
