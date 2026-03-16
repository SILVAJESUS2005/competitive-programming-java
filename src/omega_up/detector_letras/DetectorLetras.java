import java.util.*;
import java.io.*;

public class DetectorLetras{
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
    int validasLeidas = 0;

    while(validasLeidas < 10){
        String token = next();
        if(token == null) break;

        char c = token.charAt(0);

        char resultado = clasificarLetra(c);
    if(resultado != ' '){
        out.print(resultado + " ");
        validasLeidas++;
    }
    }
    out.println();
    }

    static char clasificarLetra(char c) {
        if(c >= 'A' && c <= 'Z'){
            if (c == 'Y') {
                return 'S';
            } else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                return 'V';
            } else return 'C';
        }
        else return ' ';
    }
    static String next(){
        while(st == null || !st.hasMoreTokens()) {
            try{
                String line = br.readLine();
                if(line == null) return null;
                st = new StringTokenizer(line);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
}