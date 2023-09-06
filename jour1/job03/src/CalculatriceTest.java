import java.util.Scanner;

public class CalculatriceTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez le premier nombre: ");
        double nombre1 = scan.nextDouble();

        System.out.print("Entrez le deuxième nombre: ");
        double nombre2 = scan.nextDouble();


        Calculatrice calculette = new Calculatrice();
        calculette.Somme(nombre1, nombre2);
        calculette.Diff(nombre1, nombre2);
        calculette.Produit(nombre1, nombre2);
        calculette.Division(nombre1, nombre2);

        scan.close();
    }
}
