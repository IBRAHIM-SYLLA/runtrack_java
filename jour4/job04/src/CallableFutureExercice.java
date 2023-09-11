import java.util.concurrent.*;

public class CallableFutureExercice {
    public static void main(String[] args){
        int nbr1 = Integer.parseInt(args[0]);
        int nbr2 = Integer.parseInt(args[1]);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> result = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
               int result = nbr1 * nbr2;
                return result;
            }
        });
        executor.shutdown();
        try{
            System.out.println("Résultat de la multiplication: " + result.get());
        } catch(InterruptedException e){
            e.printStackTrace();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
