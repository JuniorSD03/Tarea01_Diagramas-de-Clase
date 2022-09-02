package clase07;

public class Main {
    public static void main(String[] args) {
        Licor licor = new Licor();
        BebidaEnergetica bebidaEnergetica = new BebidaEnergetica();
        Soda soda = new Soda();

        System.out.println("BEBIDAS");

        System.out.println("\nnombre: " + licor.mostrarNombre());
        System.out.println("tipo: " + licor.mostrarTipo());
        System.out.println("cantidad: " + licor.mostrarCantidad() + "ml");
        System.out.println("precio: S/." + licor.mostrarPrecio());

        System.out.println("\nnombre: " + bebidaEnergetica.mostrarNombre());
        System.out.println("tipo: " + bebidaEnergetica.mostrarTipo());
        System.out.println("cantidad: " + bebidaEnergetica.mostrarCantidad() + "ml");
        System.out.println("precio: S/." + bebidaEnergetica.mostrarPrecio());

        System.out.println("\nnombre: " + soda.mostrarNombre());
        System.out.println("tipo: " + soda.mostrarTipo());
        System.out.println("cantidad: " + soda.mostrarCantidad() + "ml");
        System.out.println("precio: S/." + soda.mostrarPrecio());
    }
}
