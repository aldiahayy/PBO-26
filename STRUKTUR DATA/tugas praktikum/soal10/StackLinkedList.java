package praktikum2.soal10;
import java.util.LinkedList;
public class StackLinkedList {
    LinkedList<Integer> linkedlist = new LinkedList<>();

    public boolean isEmpty() {
        return linkedlist.isEmpty();
    }

    public Integer peek() {
        return linkedlist.get(linkedlist.size() - 1);
    }

    public Integer pop() {
        int value = linkedlist.get(linkedlist.size() - 1);
        linkedlist.remove(linkedlist.get(linkedlist.size() - 1));
        return value;
    }

    public void push(int element) {
        linkedlist.add(element);
    }

    public String toString() {
        return linkedlist.toString();
    }
}
