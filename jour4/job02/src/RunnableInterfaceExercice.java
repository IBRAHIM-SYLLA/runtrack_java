public class RunnableInterfaceExercice implements Runnable{
    public static void main(String[] args){
        RunnableInterfaceExercice obj = new RunnableInterfaceExercice();
        Thread thread = new Thread(obj);
        thread.start();
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("En cours d'exécution");

        }
    }
}
