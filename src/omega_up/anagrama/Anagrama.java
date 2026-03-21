import java.util.*;
import java.io.*;

public class Anagrama {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve() {
        String palabra = next();
        String palabra2 = next();

        if (palabra.length() != palabra2.length()) {
            out.print("NO son anagramas");
            return;
        }

        char[] a = palabra.toCharArray();
        char[] b = palabra2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            out.print("SI son anagramas");
        } else {
            out.print("NO son anagramas");
        }
    }

    static String next() {
        while(st == null || !st.hasMoreTokens()) {
            try {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    static int nextInt() {
        return Integer.parseInt(next());
    }
}