import java.util.*;
import java.io.*;

public class ArregloOpuestoSuma {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n / 2; i++) {
            int suma = arr[i] + arr[n - 1 - i];
            System.out.print(suma + " ");
        }
    }
}