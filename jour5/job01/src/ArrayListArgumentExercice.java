import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListArgumentExercice {
    public static void main(String[] args){
        ArrayList<String> listArgs = new ArrayList<String>(Arrays.asList(args));

        for (String list: listArgs) {
            System.out.println(list + "\n");
        }
    }
}
