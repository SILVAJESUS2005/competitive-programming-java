import java.util.*;
import java.io.*;

public class EnterosParidad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int k = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (k == 0 && arr[i] % 2 == 0) {
                sb.append(arr[i]).append(" ");
            } else if (k == 1 && arr[i] % 2 != 0) {
                sb.append(arr[i]).append(" ");
            }
        }

        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }

        System.out.print(sb.toString());
    }
}