public class CompteEpargne extends CompteBancaire {
    public double soldeCompteEpargne;
    public double interet;
    public CompteEpargne(int solde, double soldeCompteEpargne, double interet){
        super(solde);
        this.soldeCompteEpargne = soldeCompteEpargne;
        this.interet = interet;
        System.out.print("Solde du compte épargne: " + this.soldeCompteEpargne + "€ avec un taux d'intérêt de " + interet + "%\n");
    }

    public void CalculInteret(){
        double resultInteret = (this.interet * this.soldeCompteEpargne) / 100;
        double nouveauSolde = this.soldeCompteEpargne + resultInteret;
        System.out.println("Intérêt ajoutés: " + resultInteret + ". Nouveau solde: " + nouveauSolde);
    }
}
