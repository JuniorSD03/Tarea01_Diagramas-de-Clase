package clase04;

public class ConvertirMasa {
    public String tipo = "Kilogramos a gramos";
    public int kilogramos = 3;
    private int gEnKg = 1000;
    public int gramos;

    public String mostrarTipo(){
        return tipo;
    }
    public int mostrarKilogramos(){
        return kilogramos;
    }
    public int mostrarGramos(){
        gramos=kilogramos*gEnKg;
        return gramos;
    }
}
