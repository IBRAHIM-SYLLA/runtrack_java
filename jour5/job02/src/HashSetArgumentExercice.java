import java.util.HashSet;

public class HashSetArgumentExercice {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<String>();

        for (String arg : args) {
            hashSet.add(arg);
        }

        for (String arg : hashSet) {
            System.out.println(arg);
        }
    }
}
