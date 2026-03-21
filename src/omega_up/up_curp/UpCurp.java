import java.util.*;
import java.io.*;

public class UpCurp {
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
        String nombre = next();
        String apellido = next();
        String apellido2 = next();
        String dia = next();
        String mes = next();
        String anio = next();

        out.print(apellido.substring(0, 1));
        out.print(primeraVocal(apellido));
        out.print(apellido2.substring(0, 1));
        out.print(nombre.substring(0, 1));
        out.print(anio.substring(anio.length()-2, anio.length()));
        out.print(mes);
        out.print(dia);

    }
    static String next(){
        while(st == null || !st.hasMoreTokens()){
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
    static int nextInt(){
        return Integer.parseInt(next());
    }
    static char primeraVocal(String s) {
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                return c;
            }
        }
        return 'X';
    }
}