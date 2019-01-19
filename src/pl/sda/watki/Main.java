package pl.sda.watki;

class Runner implements  Runnable{
    long silnia(long n){
        if(n<2){
            return 1;
        }
        return silnia(n-1) * 1;
    }

    @Override
    public void run() {

        for(int i=0; i<500;i++){

        silnia(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
  //      Thread thread = new Thread(new Runner());
   //     Thread thread1 = new Thread(new Runner());
   //     thread.start();
   //     thread1.start();

     //   RunnerExample runnerExample = new RunnerExample();
     //   RunnerExample runnerExample1 = new RunnerExample();
     //   runnerExample.start();
     //   runnerExample1.start();





        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10;i++){
                }
            }
        });
                thread.start();
    }
}
