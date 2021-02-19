/*
 * @author : arjun@moco.com.np
 * FocusOne Payment Solutions
 *
 */

public class SleepThread extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);

            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepThread thread = new SleepThread();
        SleepThread thread1 = new SleepThread();

        thread.start();
        thread1.start();
    }
}
