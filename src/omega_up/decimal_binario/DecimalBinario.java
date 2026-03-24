import java.util.*;
import java.io.*;

public class DecimalBinario {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n < 0) {
            System.out.println("Error");
            return;
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}