package clase03;

public class Main {
    public static void main(String args[]){
        Padre padre = new Padre();
        Madre madre = new Madre();
        HijoMayor hijoMayor = new HijoMayor();
        HijoMenor hijoMenor = new HijoMenor();
        Perro perro = new Perro();

        System.out.println("PADRE");
        System.out.println("Nombre: " + padre.mostrarNombre());
        System.out.println("Edad: " + padre.mostrarEdad());
        System.out.println("Genero: " + padre.mostrarGenero());
        System.out.println("Comida preferida: " + padre.mostrarComidaPreferida());

        System.out.println("\nMADRE");
        System.out.println("Nombre: " + madre.mostrarNombre());
        System.out.println("Edad: " + madre.mostrarEdad());
        System.out.println("Genero: " + madre.mostrarGenero());
        System.out.println("Comida preferida: " + madre.mostrarComidaPreferida());

        System.out.println("\nHIJO MAYOR");
        System.out.println("Nombre: " + hijoMayor.mostrarNombre());
        System.out.println("Edad: " + hijoMayor.mostrarEdad());
        System.out.println("Genero: " + hijoMayor.mostrarGenero());
        System.out.println("Comida preferida: " + hijoMayor.mostrarComidaPreferida());

        System.out.println("\nHIJO MENOR");
        System.out.println("Nombre: " + hijoMenor.mostrarNombre());
        System.out.println("Edad: " + hijoMenor.mostrarEdad());
        System.out.println("Genero: " + hijoMenor.mostrarGenero());
        System.out.println("Comida preferida: " + hijoMenor.mostrarComidaPreferida());

        System.out.println("\nPERRO");
        System.out.println("Nombre: " + perro.mostrarNombre());
        System.out.println("Edad: " + perro.mostrarEdad());
        System.out.println("Genero: " + perro.mostrarGenero());
        System.out.println("Comida preferida: " + perro.mostrarComidaPreferida());
    }

}
