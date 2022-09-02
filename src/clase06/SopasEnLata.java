package clase06;

public class SopasEnLata {
    public String nombre = "CampBells";
    public int cantidad = 1;
    public String tipo = "Fideos con pollo";
    public float precio = (float) 10.50;
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
