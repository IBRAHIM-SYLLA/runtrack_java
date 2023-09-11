import java.util.ArrayList;
import java.util.Arrays;

public class MotsUniquesExercice {
    public static void main(String[] args){
        ArrayList<String> listeMots = new ArrayList<String>(Arrays.asList(args)); // Votre liste de mots d'origine
        ArrayList<String> motsUniques = new ArrayList<String>();

        for (String mot : listeMots) {
            if (!motsUniques.contains(mot)) {
                motsUniques.add(mot);
            } else {
                motsUniques.remove(mot);
            }
        }

        System.out.println("Mots uniques: ");
        for (String motUnique : motsUniques) {
            System.out.println(motUnique);
        }
    }
}
