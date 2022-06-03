public class Main extends Thread {

    public void run() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        /*
        new Main().start(); //begins the execution of the thread. prints "Hello!"

        RunnableSample runnableSample = new RunnableSample(); //using Runnable interface
        Thread sampleThread = new Thread(runnableSample);
        sampleThread.run(); //"Printing from RunnableSample Thread"
        sampleThread.start(); //"Printing from RunnableSample Thread"
        //threads can be given priorities, but don't count on it too much.

         */

        //sleep sample
        /*
        StringBuilder word = new StringBuilder("Mango");

        for (int i = 0; i < word.length(); i++) {
            try {
                Thread.sleep(2000); //sleeps for 2 seconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("Letter: %c\n",word.charAt(i));
        }

         */

        /*
        System.out.println("Active Threads Before: "+ Thread.activeCount()); //it is 2

        Thread t1 = new Thread(new RunnableSample(),"First Thread");
        Thread t2 = new Thread(new RunnableSample(),"Second Thread");
        Thread t3 = new Thread(new RunnableSample(),"Third Thread");
        Thread t4 = new Thread(new RunnableSample(),"Fourth Thread");
        t1.start();
        t2.start();
        try {
            System.out.println("Active Threads During: "+ Thread.activeCount()); //it is 4
            t1.join();
            t2.join();
            System.out.println("Active Threads After: "+ Thread.activeCount()); //it is 2
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */

        //synchronization example:

    }
}