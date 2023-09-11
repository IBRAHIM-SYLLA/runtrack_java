import java.util.ArrayList;

public class ListeEntiersExercice {
    public static void main(String[] args){
        ArrayList<Integer> lists = new ArrayList<>();

        for (String arg : args) {
            lists.add(Integer.parseInt(arg));
        }
        int somme = 0;
        for (int i = 0; i < lists.size(); i++) {
            int element = lists.get(i);
            //System.out.println(element);
            if(element % 2 == 0){
                somme += element;
            }
        }
        System.out.println("Somme des nombres pairs: " + somme);
    }
}
