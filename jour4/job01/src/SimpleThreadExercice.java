public class SimpleThreadExercice extends Thread{
    public static void main(String[] args){
        SimpleThreadExercice thread = new SimpleThreadExercice();
        thread.start();
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Salut du thread!");

        }
    }

}
