import java.util.*;

public class SecuenciaAbacaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = "A";

        for (int i = 2; i <= n; i++) {
            char letra = (char)('A' + i - 1);
            s = s + letra + s;
        }

        System.out.println(s);
    }
}