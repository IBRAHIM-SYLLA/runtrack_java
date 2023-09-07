public class ErreursExercice {
    public static void main(String[] args){
        double nombre1 = Double.parseDouble(args[0]);
        double nombre2 = Double.parseDouble(args[1]);

        try{
            if(nombre2 == 0){
                throw new ArithmeticException();
            } else if(args[0] == null || args[1] == null){
                throw new ArrayIndexOutOfBoundsException();
            } else {
                double result = nombre1 / nombre2;
                System.out.println("Résultat de la Division: " + result);
            }
        } catch(ArithmeticException e){
            System.err.println("Erreur: " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Erreur: " + e.getMessage());
        }
    }
}
