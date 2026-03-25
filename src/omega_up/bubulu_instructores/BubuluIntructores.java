import java.io.*;

public class BubuluIntructores {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int count = 0;
        boolean enPalabra = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!enPalabra) {
                    count++;        // empieza una nueva palabra
                    enPalabra = true;
                }
            } else {
                enPalabra = false;
            }
        }

        System.out.println(count);
    }
}