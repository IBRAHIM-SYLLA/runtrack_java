public class VoitureTest {
    public static void main(String[] args) {
        int vitesse = Integer.parseInt(args[0]);
        Voiture voiture = new Voiture();

        try {
            if(vitesse > 100) {
                throw new VoitureException();
            } else {
                voiture.accelerer(vitesse);
            }
        } catch(VoitureException e){
            System.err.println("Erreur: " + e.getMessage());
        }
    }
}
