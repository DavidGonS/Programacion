import java.util.Scanner;


public class Programas_3 {

    static int suma(){
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce un numero: ");
        int a = scan.nextInt();
        System.out.println("introduce otro numero: ");
        int b = scan.nextInt();
        int sum = 0;
        sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce el tipo de operacion: ");
        String operacion = scan.next();


        if (operacion.equals("suma")){
            System.out.println(suma());
        }
    }
}
