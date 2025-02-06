import java.util.Scanner;

public class saludoPersonal {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);

        System.out.print("Por favor ingrese su nombre: ");

        var nombre = sc.nextLine();

        System.out.println("Hola! " + nombre + ", bienvenido al curso de java de 0 a senior");

        sc.close();
    }
}