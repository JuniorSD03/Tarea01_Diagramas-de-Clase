package clase04;

public class MultiplicacionIntervalo {
    public int inicio = 8;
    public int fin = 15;
    public String operacion = "Multiplicación";
    public int resultado = 1;

    public int mostrarInicio(){
        return inicio;
    }
    public int mostrarFin(){
        return fin;
    }
    public String mostrarOperacion(){
        return operacion;
    }
    public int calcularResultado(){
        while (inicio<=fin){
            resultado=resultado*inicio;
            inicio=inicio+1;
        }
        return resultado;
    }
}
