import java.util.*;
import java.io.*;

public class ContratacionDinamicaDeque {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve(){
        int N = nextInt();
        int K = nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr [i] = nextInt();
        }
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++){
            if (!deque.isEmpty() && deque.peekFirst() == i - K){
                deque.pollFirst();
            }
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= K - 1) {
                out.print(arr[deque.peekFirst()] + " ");
            }
        }
        out.println();
    }
    static String next(){
        while (st == null || !st.hasMoreTokens()){
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

    static int nextInt(){
        return Integer.parseInt(next());
    }
}