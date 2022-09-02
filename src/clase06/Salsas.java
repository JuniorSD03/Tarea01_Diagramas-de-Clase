package clase06;

public class Salsas {
    public String nombre = "Bucatti";
    public int cantidad = 3;
    public String tipo = "Salsa de tomate";
    public float precio = (float) 6.99;

    public float precioTotal;

    public String mostrarNombre(){
        return nombre;
    }
    public int mostrarCantidad(){
        return cantidad;
    }
    public String mostrarTipo(){
        return tipo;
    }
    public float mostrarPrecio(){
        return precio;
    }
    public float calcularPrecioTotal(){
        precioTotal=cantidad*precio;
        return precioTotal;
    }
}
