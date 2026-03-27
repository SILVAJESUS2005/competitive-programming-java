import java.util.*;
import java.io.*;

public class SumaTresDatos {

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
        int n = nextInt();

        while(n > 0) {
            int suma = 0;
            for(int i = 0; i < 3; i++) {
                suma += nextInt();
            }
            out.println(suma);
            n--;
        }

    }
    static String next(){
        while(st == null || !st.hasMoreTokens()) {
            try{
                String line = br.readLine();
                st = new StringTokenizer(line);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    static int nextInt(){
        return Integer.parseInt(next());
    }
}