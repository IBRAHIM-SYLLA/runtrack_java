public class Voiture {
    public String couleur;
    public String marque;
    public int vitesse;

    public Voiture(){

    }

    public void demarrer(){
        System.out.print("La voiture démarre.\n");
    }

    public void accelerer(){
        this.vitesse += 10;
        // int speed = vitesse + 10;
        System.out.print("La vitesse est maintenant de " + vitesse + " km/h.\n");
    }

    public void freiner(){
        this.vitesse = 0;
        System.out.print("La voiture s'arrête. Vitesse réinitialisée a 0km/h.");
    }
}