import java.util.Scanner;

public class Laboratorio1 {
    public static void main(String[] args) {
        float a = 0, b= 0;
        int op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicacion");
            System.out.println("4) Division");
            System.out.println("5) Salir");
            System.out.println("Ingrese su opcion:");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el primer numero:");
                    a = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero:");
                    b = sc.nextFloat();
                    System.out.println("La suma de los numeros es: " + (a+b));
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero:");
                    a = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero:");
                    b = sc.nextFloat();
                    System.out.println("La resta de los numeros es: " + (a-b));
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero:");
                    a = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero:");
                    b = sc.nextFloat();
                    System.out.println("La multiplicacion de los numeros es: " + (a*b));
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero:");
                    a = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero:");
                    b = sc.nextFloat();
                    System.out.println("La division de los numero es: " + (a/b));
                    break;
                default:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (op != 5);
    }
}