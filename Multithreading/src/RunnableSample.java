public class RunnableSample implements Runnable{

    @Override
    public void run() {
        //System.out.println("Printing from RunnableSample Thread");
        System.out.println(Thread.currentThread().getName());
    }
}
