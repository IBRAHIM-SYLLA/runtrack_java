public class Calculatrice {

    public void Calculatrice(){

    }

    public void Somme(double nombre1, double nombre2){
        double result = nombre1 + nombre2;
        System.out.print("Somme: " + result + "\n");
    }

    public void Diff(double nombre1, double nombre2){
        double result = nombre1 - nombre2;
        System.out.print("Différence: " + result + "\n");
    }

    public void Produit(double nombre1, double nombre2){
        double result = nombre1 * nombre2;
        System.out.print("Produit: " + result + "\n");
    }

    public void Division(double nombre1, double nombre2){
        double result = nombre1 / nombre2;
        System.out.print("Division: " + result);
    }
}