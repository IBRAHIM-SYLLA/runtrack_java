public class BanqueExercice {
    public static void main(String[] args){
        CompteEpargne cptEpargne = new CompteEpargne(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        cptEpargne.CalculInteret();
    }


}
