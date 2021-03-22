import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static Vehiculo infoVehiculo() {
        System.out.println("introduce tipo de vehiculo");
        String tipo = scan.next();
        System.out.println("introduce velocidad maxima");
        double velocidadMaxima = scan.nextDouble();
        System.out.println("introduce color");
        String color = scan.next();
        System.out.println("introduce matricula");
        String matricula = scan.next();

        Vehiculo vehiculo = new Vehiculo(tipo, velocidadMaxima, color, matricula);

        System.out.println("El coche " + tipo + " tiene una velocidad de " + velocidadMaxima + " es de color " + color + " y su matricula es " + matricula);
        return vehiculo;
    }

    public static Vehiculo pideVehiculo() {
        System.out.println("introduce tamaño del array");
        int tamaño = scan.nextInt();

        Vehiculo[] vehiculos = new Vehiculo[tamaño];


        for (int i = 0; i < tamaño; i++) {
            Vehiculo vehiculo = scan.next();

        }
    }

    public static void main(String[] args) {
        infoVehiculo();
    }
}
