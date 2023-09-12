import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamMapExercice {
    public static void main(String[] args){
        ArrayList<String> listArgs = new ArrayList<>();

        for(int i = 0; i < args.length; i++){
            listArgs.add(args[i]);
        }

        System.out.println(
                listArgs.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.joining(", "))
        );
    }
}
