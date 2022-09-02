package clase06;

public class Jugos {
    public String nombre = "TreeTop";
    public int cantidad = 12;
    public String tipo = "Manzana y Pera";
    public float precio = (float) 3.30;
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
