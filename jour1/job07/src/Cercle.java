public class Cercle {
    public double rayon;
    public double pi = 3.14;

    public void calculAire(double rayon){
        this.rayon = rayon;
        double aire = this.pi * (this.rayon * this.rayon);
        System.out.print("Aire du cercle de rayon " + this.rayon + ": " + aire + "\n");
    }

}
