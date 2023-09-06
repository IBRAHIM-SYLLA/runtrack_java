import java.util.Scanner;

public class CalculAir {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Tape une longueur de rayon pour le cercle: ");
        double rayon = scan.nextDouble();

        System.out.print("Tape une longueur de côté pour le carré: ");
        double cote = scan.nextDouble();

        Cercle cercle = new Cercle();
        cercle.calculAire(rayon);

        Carre carre = new Carre();
        carre.calculAire(cote);

        scan.close();
    }
}