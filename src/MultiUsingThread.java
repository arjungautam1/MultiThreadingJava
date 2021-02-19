/*
 * @author : arjun@moco.com.np
 * FocusOne Payment Solutions
 *
 */
/* Java Thread extending thread */

public class MultiUsingThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MultiUsingThread t1 = new MultiUsingThread();
        t1.start();
    }
}
