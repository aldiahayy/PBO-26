package praktikum5;
public class AnimasiThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Animasi Thread: " + i);

                // Delay 1 detik
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

            System.out.println("Thread terganggu");
        }
    }
}
