import java.io.*;
import java.util.*;

/**
 * Problem Name: Template of Fast Reader with a basic example.
 * Description: Read a number 'n', then read an array of 'n' elements and print the sum using fast read.
 * * Platform: Custom Practice
* * @author SILVAJESUS2005
 * @date 2026-03-05
 */
public class PlantillaFastReaderIO {

    // Variables globales estáticas para que cualquier método pueda acceder a ellas
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String[] args) {
        // 1. Inicializar los flujos de la lectura y escritura cacheados (Buffers)
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        // 2. Control de múltiples casos de prueba (Test Cases)
        // Muchos problemas de CP te dan un numero 't' de casos a resolver.
        // Si el problema solo tiene un caso, simplemente borras la lectura de 't'.
        int t = 1;
        if (hasMoreTokens()) { //Opcional: solo si el problema especifica 't' casos.
            // t = nextInt();
        }

        while (t-- > 0) {
            solve();
        }

        // 3. Vaciar el buffer de salida al final.
        // Si olvidas esta línea, tu programa no imprimira nada y dara Wrong Answer.
        out.flush();
        out.close();
    }

    // Método principal donde va la lógica de tu algoritmo
    static void solve() {
        // EJEMPLO: Leer un número 'n', luego leer un arreglo de 'n' elementos,e imprimir la suma.

        // Lectura (Read)
        int n = nextInt();
        long suma = 0; // Usamos long para evitar Integer Overflow

        for(int i = 0; i < n; i++) {
            suma += nextInt();
        }

        // Impresión (Print)
        out.println(suma);
    }

    // ======================================
    // MÉTODOS DE LECTURA RÁPIDA (FAST I/O)
    // ======================================

    static String next() {
        // StringTokenizer divide la línea en "tokens" ignorando los espacios en blanco.
        while(st == null || !st.hasMoreElements()) {
            try {
                String line = br.readLine();
                if (line == null) return null; // Fin del archivo (EOF)
                st = new StringTokenizer(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static long nextLong() {
        return Long.parseLong(next());
    }

    static Double nextDouble() {
        return Double.parseDouble(next());
    }

    static String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }

    // Método auxiliar para evitar excepciones si el archivo termina inesperadamente
    static boolean hasMoreElements() {
        while (st == null || !st.hasMoreElements()) {
            try {
                String line = br.readLine();
                if (line == null) return false;
                st = new StringTokenizer(line);
            } catch(IOException e) {
                return false;
            }
        }
        return true;
    }

}