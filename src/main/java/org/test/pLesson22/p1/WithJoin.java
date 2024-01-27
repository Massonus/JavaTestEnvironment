package org.test.pLesson22.p1;

public class WithJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "1 - " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Thread thread0 = new Thread(new WithJoin());

        thread0.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000);
                if (i == 2){
                   /* thread0.join();*/
                thread0.join(4000);
                   /* thread0.stop();*/

                    System.out.println(thread0.isInterrupted());
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }




    }


}
