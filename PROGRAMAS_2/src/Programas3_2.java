import java.util.Scanner;

public class Programas3_2 {

    static String eliminaVocales(String texto) {
        String result = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            switch (caracter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                default:
                    result += caracter;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce un texto: ");
        String texto = scan.nextLine();

        String result = eliminaVocales(texto);

        System.out.println(result);
    }
}
