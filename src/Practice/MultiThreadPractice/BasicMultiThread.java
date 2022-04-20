package Practice.MultiThreadPractice;

class StandardThreadStarter implements Runnable {
    @Override
    public void run() {
        System.out.println("WAZZUP");
    }
}

class MyOwnThread extends Thread {
    @Override
    public void run() {
        System.out.println("WAZZUP AGAIN?");
    }
}

public class BasicMultiThread {


    public static void main(String[] args) {
        StandardThreadStarter threadStarter;
        threadStarter = new StandardThreadStarter();
        Thread newThread = new Thread(threadStarter);
        newThread.start();
        System.out.println("it's done");
        if(newThread.isAlive()){
            System.out.println("1st one is still goin'");
        }
        MyOwnThread anotherThread = new MyOwnThread();
        anotherThread.setDaemon(true);
        anotherThread.start();


    }

}
