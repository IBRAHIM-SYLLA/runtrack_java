import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamFilterExercice {
    public static void main(String[] args){
        int nbrRef = Integer.parseInt(args[0]);
        ArrayList<Integer> nbrs = new ArrayList<>();

        for(int i = 0; i < args.length; i++){
            nbrs.add(Integer.parseInt(args[i]));
        }

        System.out.println(
                "Nombres supérieurs à " + nbrRef + ": " +
                        nbrs.stream()
                                .filter(n -> n > nbrRef)
                                .map(Objects::toString)
                                .collect(Collectors.joining(", "))
        );
    }
}
