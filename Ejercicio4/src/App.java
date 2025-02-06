import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);

        System.out.print("Ingrese la palabra 1: ");

        var palabra1 = sc.nextLine();

        System.out.print("Ingrese la palabra 2: ");

        var palabra2 = sc.nextLine();

        System.out.print("Ingrese la palabra 2: ");

        var palabra3 = sc.nextLine();

        System.out.println(""+palabra1+" "+palabra2+", "+palabra3);

        sc.close();
    }
}
