import java.security.Key;
import java.util.HashMap;

public class HashMapArgumentExercice {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        if(args.length % 2 != 0){
            System.out.println("Le nombre d'argument doit être paire");
            return;
        }

        for(int i = 0; i < args.length; i+=2){
            String cle = args[i];
            String valeur = args[i + 1];
            map.put(cle, valeur);

        }

        for (String cle: map.keySet()) {
            String val = map.get(cle);
            System.out.println(cle + " : " + val);
        }
    }
}
