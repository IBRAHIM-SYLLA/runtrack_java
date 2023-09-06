public class CompteBancaire {
    public int solde;
    public int result;

    public void CompteBancaire(int solde){
        this.solde = solde;
        System.out.print("Solde actuel: " + this.solde + "€\n");
    }

    public void deposer(int pognon){
         this.result = this.solde + pognon;
        System.out.print(pognon + "€ déposés. Nouveau solde: " + this.result + "€\n");
    }

    public void retirer(int pognon){
        this.result = this.result - pognon;
        if (pognon > this.result){
            System.out.print("Tentative de retrait de " + pognon + "€... Solde insuffisant\n");
        } else {
            System.out.print(pognon + "€ retirés. Nouveau solde: " + this.result + "€");
        }
    }
}