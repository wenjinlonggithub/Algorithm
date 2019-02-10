package multithreading;

import java.util.concurrent.Semaphore;

public class AlternatePrint {

    private static Semaphore[] semaphores;
    private static final int ThreadNum = 3;
    private static final int PrintNum = 10;


    public static void main(String[] args) {

        semaphores = new Semaphore[ThreadNum];

        for (int i = 0; i < ThreadNum; i++) {
            semaphores[i] = new Semaphore(0);
        }

        semaphores[0].release();

        for (int i = 0; i < ThreadNum; i++) {

            final int cur = i;
            final int next = (i + 1) % ThreadNum;

            new Thread(() -> {

                for (int j = 0; j < PrintNum; j++) {

                    try {
                        semaphores[cur].acquire();
                        char c = (char) ('A' + cur);
                        System.out.println(c);
                        semaphores[next].release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }).start();
        }
    }
}
