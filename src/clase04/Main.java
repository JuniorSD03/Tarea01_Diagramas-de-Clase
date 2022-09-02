package clase04;

public class Main {
    public static void main(String args[]){
        int i=0;
        SumaIntervalo sumaIntervalo = new SumaIntervalo();
        MultiplicacionIntervalo multIntervalo = new MultiplicacionIntervalo();
        GeneradorCodigo generadorCodigo = new GeneradorCodigo();
        ConvertirTiempo convertTiempo = new ConvertirTiempo();
        ConvertirMasa convertMasa = new ConvertirMasa();
        EscogerEstudiante escogerEstudiante = new EscogerEstudiante();
        RestaIntervalo restaIntervalo = new RestaIntervalo();

        System.out.println("SUMA DE UN INTERVALO DE NUMEROS");
        System.out.println(sumaIntervalo.mostrarOperacion() + " de los números desde " + sumaIntervalo.mostrarInicio() + " hasta " + sumaIntervalo.mostrarFin());
        System.out.println("Resultado = " + sumaIntervalo.calcularResultado());

        System.out.println("\nMULTIPLICACIÓN DE UN INTERVALO DE NUMEROS");
        System.out.println(multIntervalo.mostrarOperacion() + " de los números desde " + multIntervalo.mostrarInicio() + " hasta " + multIntervalo.mostrarFin());
        System.out.println("Resultado = " + multIntervalo.calcularResultado());

        System.out.println("\nGENERADOR DE UN CÓDIGO ALEATORIO");
        System.out.println("Su código generado será de " + generadorCodigo.mostrarNumeroCaracteres() + " digitos");
        System.out.println("Su código generado es: " + generadorCodigo.mostrarCodigoGenerado());

        System.out.println("\nCONVERTIR MINUTOS A SEGUNDOS");
        System.out.println("Convertir " + convertTiempo.mostrarMinutos() + " " + convertTiempo.mostrarTipo());
        System.out.println(convertTiempo.mostrarMinutos() + " minutos = " + convertTiempo.mostrarSegundos() + " segundos");

        System.out.println("\nCONVERTIR KILOGRAMOS A GRAMOS");
        System.out.println("Convertir " + convertMasa.mostrarKilogramos() + " " + convertMasa.mostrarTipo());
        System.out.println(convertMasa.mostrarKilogramos() + "Kg = " + convertMasa.mostrarGramos() + "g");

        System.out.println("\nESCOGER ESTUDIANTE AL AZAR");
        System.out.println("Se elige un estudiante al azar de " + escogerEstudiante.mostrarNumEstudiantes() + " estudiantes");
        System.out.println("El estudiante elegido es el numero " + escogerEstudiante.mostrarEstudianteEscogido() + " de la lista.");

        System.out.println("\nRESTA DE UN INTERVALO DE NUMEROS");
        System.out.println(restaIntervalo.mostrarOperacion() + " de los números desde " + restaIntervalo.mostrarInicio() + " hasta " + restaIntervalo.mostrarFin());
        System.out.println("Resultado = " + restaIntervalo.calcularResultado());
    }
}
