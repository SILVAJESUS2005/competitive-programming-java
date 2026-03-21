import java.util.*;
import java.io.*;

public class DiferenciaMinima {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String [] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve() {
        int n = nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }

        int mid = n / 2;

        // dividir arreglo
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        List<Integer> sumLeft = new ArrayList<>();
        List<Integer> sumRight = new ArrayList<>();

        generarSumas(left, 0, 0, sumLeft);
        generarSumas(right, 0, 0, sumRight);

        Collections.sort(sumRight);

        int total = 0;
        for (int x : arr) total += x;

        int objetivo = total / 2;
        int mejor = Integer.MAX_VALUE;

        for (int s1 : sumLeft) {
            int restante = objetivo - s1;

            int idx = Collections.binarySearch(sumRight, restante);
            if (idx < 0) idx = -idx - 1;

            if (idx < sumRight.size()) {
                int s2 = sumRight.get(idx);
                int suma = s1 + s2;
                mejor = Math.min(mejor, Math.abs(total - 2 * suma));
            }

            if (idx > 0) {
                int s2 = sumRight.get(idx - 1);
                int suma = s1 + s2;
                mejor = Math.min(mejor, Math.abs(total - 2 * suma));
            }
        }

        out.println(mejor);
    }

    static void generarSumas(int[] arr, int i, int suma, List<Integer> lista) {
        if (i == arr.length) {
            lista.add(suma);
            return;
        }

        generarSumas(arr, i + 1, suma, lista);
        generarSumas(arr, i + 1, suma + arr[i], lista);
    }

    static String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = br.readLine();
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }

        return st.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }
}