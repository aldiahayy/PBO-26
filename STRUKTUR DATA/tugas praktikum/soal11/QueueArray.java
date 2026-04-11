package praktikum2.soal11;
public class QueueArray {
    public int max = 1;
    public int[] arr = new int[max];
    public int index = -1;

    public void offer(int data) {
        index++;
        if (index >= max) {
            max += 1;
            int[] arrBaru = new int[max];
            for (int i = 0; i < arr.length; i++) {
                arrBaru[i] = arr[i];
            }
            arr = arrBaru;
        }
        arr[index] = data;
    }

    public Integer poll() {
        int save = arr[0];
        arr[0] = 0;
        for (int i = 0; i < index; i++) {
            arr[i] = arr[i + 1];
        }
        index--;
        return save;
    }

    public Integer peek() {
        return arr[0];
    }

    public boolean isEmpty() {
        return index < 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= index; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
