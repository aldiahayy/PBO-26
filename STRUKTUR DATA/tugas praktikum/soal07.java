package praktikum2;
import java.util.Scanner;
import java.util.Stack;
public class soal07 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kata: ");
        String teks = sc.nextLine();

        for (int i = 0; i < teks.length(); i++) {
            stack.push(teks.charAt(i));
        }
        System.out.println(stack);
        String reverse = "";
        while (!stack.empty()){
            reverse += stack.peek();
        }

        System.out.println("Hasil reverse : " + reverse);
        System.out.println(stack);
    }
}
