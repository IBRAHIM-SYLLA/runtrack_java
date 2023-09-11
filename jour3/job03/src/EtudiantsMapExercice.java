import java.util.HashMap;

public class EtudiantsMapExercice {
    public static void main(String[] args){
        HashMap<Integer, String> etudiantsMap = new HashMap<Integer, String>();

        etudiantsMap.put(101, "Pierre");
        etudiantsMap.put(102, "Marie");
        etudiantsMap.put(103, "Jean");

       // System.out.println(etudiantsMap);

        for (Integer cle : etudiantsMap.keySet()) {
            String etudiant = etudiantsMap.get(cle);
            System.out.println(cle + ": " + etudiant);
        }

    }
}
