import java.util.Scanner;


public class Programas_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("seleccione el tipo de operacion que quiere realizar: buscar el maximo, minimo o calcular la media");
        String operacion = scan.next();

        System.out.println("primero introduzca el tamaño del array que quiere usar:");
        int tamaño = scan.nextInt();


        for (int i = 0; i < tamaño; i++) {
            System.out.println("introduzca un numero:");
            int numero = scan.nextInt();
            int[] arrayNumeros = new int[numero];

            if (operacion.equals("maximo")){

            }else if (operacion.equals("media")){

            }
        }


//        if (operacion.equals("maximo")) {
//            int maximo = 0;
//            for (int i = 0; i < tamaño; i++) {
//                if (maximo < arrayNumeros[i]) {
//                    maximo = arrayNumeros[i];
//                }
//                System.out.println("el maximo es: " + maximo);
//
//            }
//
//        } else if (operacion.equals("minimo")) {
//            int minimo = 0;
//            for (int i = 0; i < arrayNumeros[tamaño]; i++) {
//                if (minimo < arrayNumeros[i]) {
//                    minimo = arrayNumeros[i];
//                }
//                System.out.println("el minimo es: " + minimo);
//            }
//
//        } else if (operacion.equals("media")) {
//            int media = 0;
//            for (int i = 0; i < arrayNumeros[i]; i++) {
//                media = media + arrayNumeros[i];
//            }
//            System.out.println("la media es: " + media / arrayNumeros.length);
//
//
//        } else {
//            System.out.println("no se ha introducido bien la operacion. Vuelva a empezar");
//        }

    }
}
