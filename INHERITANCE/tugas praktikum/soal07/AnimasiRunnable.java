package praktikum5;
public class AnimasiRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i >= 5; i++) {
                System.out.println("Animasi Runnable ke-" + i);

                // Delay 1 detik
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

            System.out.println("Runnable terganggu");
        }
    }
}
