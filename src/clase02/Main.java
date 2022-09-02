package clase02;

public class Main {
    public static void main(String args[]){
        Zoologico zoologico = new Zoologico();
        Veterinario veterinario = new Veterinario();
        AsistenteVeterinario asisVet = new AsistenteVeterinario();
        Animal animal = new Animal();

        System.out.println("ZOOLÓGICO");
        System.out.println("Nombre: " + zoologico.mostrarNombre());
        System.out.println("Ubicación: " + zoologico.mostrarUbicacion());
        System.out.println("Hora de apertura: " + zoologico.mostrarApertura());
        System.out.println("Hora de cierre: " + zoologico.mostrarCierre());

        System.out.println("\nVETERINARIO");
        System.out.println("Nombre: " + veterinario.mostrarNombre());
        System.out.println("Edad: " + veterinario.mostrarEdad());
        System.out.println("Especialidad: " + veterinario.mostrarEspecialidad());
        System.out.println("Sector: " + veterinario.mostrarSector());

        System.out.println("\nASISTENTE DEL VETERINARIO");
        System.out.println("Nombre: " + asisVet.mostrarNombre());
        System.out.println("Edad: " + asisVet.mostrarEdad());
        System.out.println("Especialidad: " + asisVet.mostrarEspecialidad());
        System.out.println("Sector: " + asisVet.mostrarSector());

        System.out.println("\nANIMAL");
        System.out.println("Codigo: " + animal.mostrarCodigo());
        System.out.println("Nombre Científio: " + animal.mostrarNombreCientifico());
        System.out.println("Familia: " + animal.mostrarFamilia());
        System.out.println("Alias: " + animal.mostrarAlias());

    }
}
