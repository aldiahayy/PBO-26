package praktikum2.soal11;
import java.util.Vector;
public class QueueVektor {
    Vector<Integer> vector = new Vector<>();
    public void offer(int value) {
        vector.add(value);
    }

    public int peek() {
        return vector.get(0);
    }

    public int poll() {
        int value = vector.get(0);
        vector.remove(0);
        return value;
    }

    public boolean isEmpty() {
        return vector.isEmpty();
    }

    public String toString() {
        return vector.toString();
    }
}
