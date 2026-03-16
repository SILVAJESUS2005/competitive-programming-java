import java.util.*;
import java.io.*;

public class ParImpar {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String[] args) {
        br= new BufferedReader (new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve(){
    int n = nextInt();
    if(n % 2 == 0){
        out.println("par");
    } else {
        out.println("impar");
    }
    }

    static String next(){
        while (st == null || !st.hasMoreTokens()){
            try {
                String linea = br.readLine();
                if(linea == null) return null;
                st = new StringTokenizer(linea);
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