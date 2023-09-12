public class LambdaArgumentExercice {
    public static void main(String[] args){
        String mot = args[0];
        Integer taille = Integer.parseInt(args[1]);

        LambdaInterface checkTaille = (m, t) -> {
            if(m.length() > t){
                return "La chaîne " + m + " a une longueur supérieure à " + t;
            }
            else if(m.length() < t){
                return "La chaîne " + m + " a une longueur inférieure à " + t;
            }
            else {
                return "La chaîne " + m + " a une longueur égale à " + t;
            }
        };
        System.out.println(checkTaille.checkTaille(mot, taille));
    }
}
