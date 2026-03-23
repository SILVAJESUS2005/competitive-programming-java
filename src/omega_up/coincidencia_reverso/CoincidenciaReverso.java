import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(n - 1 - i));

            if (a == b) {
                count++;
            }
        }

        System.out.println(count);
    }
}