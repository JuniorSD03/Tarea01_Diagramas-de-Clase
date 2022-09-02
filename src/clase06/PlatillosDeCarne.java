package clase06;

public class PlatillosDeCarne {
    public String nombre = "SPAM";
    public int cantidad = 6;
    public String tipo = "Carne de pavo";
    public float precio = (float) 23.5;
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
