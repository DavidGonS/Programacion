import java.util.Scanner;

public class Programas2_6 {

    static double media(double[] numeros) {
        double sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];

        }
        return sum / numeros.length;
    }

    static double[] parseNumeros(String numeros) {
        String[] numerosArray = numeros.split(",");
        double[] doublesArray = new double[numerosArray.length];
        for (int i = 0; i < doublesArray.length; i++) {
            double num = Double.parseDouble(numerosArray[i].trim());
            doublesArray[i] = num;
        }
        return doublesArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce numeros decimales separados por coma");
        String numerosStr = scan.nextLine();
        double[] numeros = parseNumeros(numerosStr);
        System.out.println(media(numeros));
    }
}
