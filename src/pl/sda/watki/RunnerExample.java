package pl.sda.watki;



public class RunnerExample extends  Thread {

    @Override
    public void run() {

        for (int i =  0; i < 10; i++) {



            System.out.println("Hello: " + " thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}