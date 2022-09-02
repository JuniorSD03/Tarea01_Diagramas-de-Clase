package clase04;

public class SumaIntervalo {
    public int inicio = 10;
    public int fin = 20;
    public String operacion = "Suma";
    public int resultado;

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
            resultado=resultado+inicio;
            inicio=inicio+1;
        }
        return resultado;
    }
}
