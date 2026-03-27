import java.util.*;
import java.io.*;

public class FrecuenciaLetra {

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
    String palabra = next();
    char letra = nextChar();
    char[] letras = palabra.toCharArray();

    int count = 0;

    for(int i = 0; i < letras.length; i++){
        if(letras[i] == letra ){
            count++;
        }
    }
    out.println(count);

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

    static char nextChar(){
        return next().charAt(0);
    }
}