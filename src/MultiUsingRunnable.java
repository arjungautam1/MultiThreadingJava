/*
 * @author : arjun@moco.com.np
 * FocusOne Payment Solutions
 *
 */

/* Java thread using implementing runnable interface */

public class MultiUsingRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running ...");
    }

    public static void main(String[] args) {
        MultiUsingRunnable multi1 = new MultiUsingRunnable();
        Thread thread = new Thread(multi1);
        thread.start();
    }
}
