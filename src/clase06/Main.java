package clase06;

public class Main {
    public static void main(String[] args) {
        Salsas salsas = new Salsas();
        SopasEnLata sopasEnLata = new SopasEnLata();
        PlatillosDeCarne platillosDeCarne = new PlatillosDeCarne();
        Jugos jugos = new Jugos();

        System.out.println("LISTA DE COMPRAS");

        System.out.println("\nNombre: " + salsas.mostrarNombre());
        System.out.println("Cantidad: " + salsas.mostrarCantidad());
        System.out.println("Precio: " + salsas.mostrarPrecio());
        System.out.println("Tipo: " + salsas.mostrarTipo());
        System.out.println("Precio Total: " + salsas.calcularPrecioTotal());

        System.out.println("\nNombre: " + sopasEnLata.mostrarNombre());
        System.out.println("Cantidad: " + sopasEnLata.mostrarCantidad());
        System.out.println("Precio: " + sopasEnLata.mostrarPrecio());
        System.out.println("Tipo: " + sopasEnLata.mostrarTipo());
        System.out.println("Precio Total: " + sopasEnLata.calcularPrecioTotal());

        System.out.println("\nNombre: " + platillosDeCarne.mostrarNombre());
        System.out.println("Cantidad: " + platillosDeCarne.mostrarCantidad());
        System.out.println("Precio: " + platillosDeCarne.mostrarPrecio());
        System.out.println("Tipo: " + platillosDeCarne.mostrarTipo());
        System.out.println("Precio Total: " + platillosDeCarne.calcularPrecioTotal());

        System.out.println("\nNombre: " + jugos.mostrarNombre());
        System.out.println("Cantidad: " + jugos.mostrarCantidad());
        System.out.println("Precio: " + jugos.mostrarPrecio());
        System.out.println("Tipo: " + jugos.mostrarTipo());
        System.out.println("Precio Total: " + jugos.calcularPrecioTotal());
    }
}
