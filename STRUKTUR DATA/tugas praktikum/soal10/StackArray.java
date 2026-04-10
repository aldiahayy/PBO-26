package praktikum2.soal10;
public class StackArray {
    public int max = 1;
    public int[] arr = new int[max];
    public int top = -1;

    public void push(int data) {
        top++;
        if (top >= max) {
            max += 1;
            int[] arrBaru = new int[max];
            for (int i = 0; i < arr.length; i++) {
                arrBaru[i] = arr[i];
            }
            arr = arrBaru;
        }
        arr[top] = data;
    }

    public Integer pop() {
        if (!isEmpty()) {
            int save = arr[top];
            top--;
            return save;
        }
        return null;
    }

    public Integer peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
