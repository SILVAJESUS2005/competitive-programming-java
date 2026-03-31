import java.util.*;
import java.io.*;

public class EmparejandoEntrenamiento {
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

    static void solve(){
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();
        int d = nextInt();

        int res = Integer.MAX_VALUE;

        res = Math.min(res, Math.abs((a + b) - (c + d)));
        res = Math.min(res, Math.abs((a + c) - (b + d)));
        res = Math.min(res, Math.abs((a + d) - (b + c)));

        System.out.println(res);
    }

    static int nextInt(){
        return Integer.parseInt(next());
    }

    }
