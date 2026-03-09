import java.util.*;
import java.io.*;

/**
 * Problem Name: Weird Algorithm
 * Description: Simulates the Collatz conjecture sequence for a given number.
 * Platform: CSES Problem Set
 * Time Complexity: O(S) where S is the number of steps in the sequence.
 * Space Complexity: O(1) as no extra memory structures are used.
 * @author SILVAJESUS2005
 * @date 2026-03-08
 */

public class WeirdAlgorithm {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String [] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve() {
        long n = nextLong();
        out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                out.print(n + " ");
            } else {
                n = (n * 3) + 1;
                out.print(n + " ");
            }
        }
    }

    static String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                String line = br.readLine();
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            }  catch (IOException e) {
                e.printStackTrace();
            }
                }

        return st.nextToken();
    }

    static long nextLong() {
        return Long.parseLong(next());
    }
}