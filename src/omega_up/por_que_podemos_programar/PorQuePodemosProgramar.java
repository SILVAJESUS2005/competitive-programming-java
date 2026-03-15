import java.util.*;
import java.io.*;

public class PorQuePodemosProgramar {
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

    static void solve(){
    double x = nextDouble();

    double y = (((x + x*x)/((5*x) + 3)) + x) * (((x + x*x)/((5*x) + 3)) / (((x + x*x)/((5*x) + 3)) + 2*x));

    out.printf( "%.6f%n", y);
    }

    static String next(){
        while(st == null || !st.hasMoreTokens()){
            try{
                String line = br.readLine();
                st = new StringTokenizer(line);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    static double nextDouble(){
        return Double.parseDouble(next());
    }
}