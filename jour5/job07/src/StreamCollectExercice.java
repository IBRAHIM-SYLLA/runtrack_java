import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamCollectExercice {
    public static void main(String[] args) {
        int nbrRef = Integer.parseInt(args[0]);
        ArrayList<Integer> listArgs = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            listArgs.add(Integer.parseInt(args[i]));
        }

        List<Integer> nbrs =
                listArgs.stream()
                        .filter(n -> n < nbrRef)
                        .toList();

        System.out.println(
                "Nombres inférieur à " + nbrRef + ": " +
                        nbrs.stream()
                                .map(Objects::toString)
                                .collect(Collectors.joining(", "))
        );
    }
}