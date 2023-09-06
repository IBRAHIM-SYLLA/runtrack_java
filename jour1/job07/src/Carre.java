public class Carre {
    public double cote;

    public void calculAire(double cote){
        this.cote = cote;
        double aire = this.cote * this.cote;
        System.out.print("Aire du carré de côté" + this.cote + ": " + aire);
    }
}
