import java.util.Scanner;

public class Programas3_1 {
    static Scanner scan = new Scanner(System.in);

    static int contar(String escaneado, char caracter) {
        int cuantasVeces = 0;
        for (int i = 0; i < escaneado.length(); i++) {
            char unCaracter = escaneado.charAt(i);
            if (cuantasVeces == caracter) {
                cuantasVeces++;
            }
        }
        return cuantasVeces;
    }

    public static void main(String[] args) {
        System.out.println("escribe un texto...");
        String texto = scan.nextLine();

        System.out.println("introduce un caracter");

        char caracter = scan.next().charAt(0);
        int resultado = contar(texto, caracter);

        System.out.println(resultado);

    }
}
