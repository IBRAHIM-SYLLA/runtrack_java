public class Etudiant {
   public String nom;
   public double notes;

   public void afficheNom(String nom){
       this.nom = nom;
       System.out.print("Nom de l'étudiant: " + this.nom + "\n");
   }

   public void moyenne(int note1, int note2, int note3, int note4){
       double sum = note1 + note2 + note3 + note4;
       double moyenne = sum / 4;
       System.out.print("Moyenne: " + moyenne);
   }

}