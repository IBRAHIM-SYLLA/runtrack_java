import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EtudiantTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Etudiant etudiant = new Etudiant();
        etudiant.afficheNom("Bob");

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez une note: ");
        int note1 = scan.nextInt();

        System.out.print("Entrez encore une note: ");
        int note2 = scan.nextInt();

        System.out.print("Entrez encore une note: ");
        int note3 = scan.nextInt();

        System.out.print("Entrez encore une note: ");
        int note4 = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(note1);
        list.add(note2);
        list.add(note3);
        list.add(note4);

        //Integer[] listeEntiere = list.toArray(new Integer[0]);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {

            int element = list.get(i);
            System.out.print(element);
            if (i < list.size() - 1) {
                System.out.print(", "); // Ajoutez une virgule s'il y a plus d'éléments
            }
        }
        System.out.println("]");

        int noteBasse = Collections.min(list);
        int noteHaute = Collections.max(list);

        System.out.print("Note la plus haute: " + noteHaute + "\n");
        System.out.print("Note la plus basse: " + noteBasse + "\n");

        etudiant.moyenne(note1, note2, note3, note4);

        scan.close();
    }
}
