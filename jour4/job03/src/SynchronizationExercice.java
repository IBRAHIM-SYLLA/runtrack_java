public class SynchronizationExercice implements Runnable{
    static Banque banque;
    static int retrait;


    public static void main(String[] args){

       banque = new Banque(Integer.parseInt(args[0]));
       retrait = Integer.parseInt(args[1]);
        SynchronizationExercice obj = new SynchronizationExercice();
        Thread threadOne = new Thread(obj);
        Thread threadTwo = new Thread(obj);

        threadOne.start();
        threadTwo.start();
        try{
            threadOne.join();
            threadTwo.join();
        } catch(InterruptedException e){

        }
        System.out.println("Solde final: " + banque.solde);
    }

    @Override
    public void run() {
        banque.retirer(retrait, Thread.currentThread().getName());
    }
}
