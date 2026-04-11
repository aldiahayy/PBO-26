package praktikum2.soal10;
import java.util.Vector;
public class StackVektor {
    Vector<Integer> vector = new Vector<>();

    public boolean isEmpty() {
        return vector.isEmpty();
    }

    public Integer peek() {
        return vector.get(vector.size() - 1);
    }

    public Integer pop() {
        int value = vector.get(vector.size() - 1);
        vector.remove(vector.get(vector.size() - 1));
        return value;
    }

    public void push(int element) {
        vector.add(element);
    }

    public String toString() {
        return vector.toString();
    }
}
