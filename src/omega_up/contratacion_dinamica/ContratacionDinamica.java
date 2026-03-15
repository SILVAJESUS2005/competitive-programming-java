import java.util.*;
import java.io.*;

public class ContratacionDinamica {
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
    for (int i = 0; i <= N - K; i++){
        int max = arr[i];
        for (int j = 1; j < K; j++){
            if (arr[i + j] > max){
                max = arr[i + j];
            }
        }
        out.print(max + " ");
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