import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom: ");
        String nom = scan.nextLine();

        System.out.println("Hello, " + nom);
    }
}