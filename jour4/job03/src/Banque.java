public class Banque {
    public int solde;
    public int result;

    public Banque(int solde){
        this.solde = solde;
    }

    public void deposer(int pognon){
         this.result = this.solde + pognon;
        System.out.print(pognon + "€ déposés. Nouveau solde: " + this.result + "€ \n");
    }

    public void retirer(int pognon, String thread){
        synchronized (this){
            this.solde = this.solde - pognon;
            System.out.println(thread + " a retiré " + pognon + ".");
        }
    }

    public void solde(){
        System.out.print("Solde final: " + this.solde + "€");
    }
}