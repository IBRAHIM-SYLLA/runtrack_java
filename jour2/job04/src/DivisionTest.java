public class DivisionTest {
    public static void main(String[] args){
        double nombre1 = Double.parseDouble(args[0]);
        double nombre2 = Double.parseDouble(args[1]);
        try{
            //

            if (nombre2 == 0) {
                throw new DivisionException();
            }else {
                double result = nombre1 / nombre2;
                System.out.println("Résultat de la division: " + result);
            }

        }catch(DivisionException e){
            System.err.println("Erreur: " + e.getMessage());
        }


    }
}
