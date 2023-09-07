import java.util.Scanner;

public class BanqueTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CompteBancaire compte = new CompteBancaire(100);
        // compte.CompteBancaire(100);
        Scanner scan = new Scanner(System.in);

        System.out.print("Combien on dépose aujourd'hui ? : ");
        int depot = scan.nextInt();
        compte.deposer(depot);

        System.out.print("On retire combien aujourd'hui ? : ");
        int retrait = scan.nextInt();
        compte.retirer(retrait);

        scan.close();


    }
}
