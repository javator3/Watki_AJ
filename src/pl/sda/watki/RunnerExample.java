package pl.sda.watki;


import java.util.Random;

public class RunnerExample extends  Thread {

    @Override
    public void run() {

        Random random = new Random();
        int i = random.nextInt();
   //     for (int i =  0; i < 10; i++) {





            System.out.println("liczba: " + i + "wynik" +i*2+ " thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
