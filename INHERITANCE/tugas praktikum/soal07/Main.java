package praktikum5;
public class Main {
    public static void main(String[] args) {
        // extends Thread
        AnimasiThread thread1 = new AnimasiThread();

        // Menjalankan thread
        thread1.start();

        // implements Runnable
        AnimasiRunnable runnable = new AnimasiRunnable();

        Thread thread2 = new Thread(runnable);

        // Menjalankan thread
        thread2.start();
    }
}
