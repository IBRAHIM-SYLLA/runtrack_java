public class GenericsExercice {
    public static void  main(String[] args){
        Boite<String> boite = new Boite<>();
        for(String arg : args) {
            boite.addList(arg);
        }
        System.out.println("Contenu de la boîte: " + boite.getAllList());
    }

}
