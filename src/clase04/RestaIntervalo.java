package clase04;

public class RestaIntervalo {
    public int inicio = 1;
    public int fin = 3;
    public String operacion = "Resta";
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
        resultado=inicio;
        while (inicio<fin){
            inicio=inicio+1;
            resultado=resultado-inicio;
        }
        return resultado;
    }
}
