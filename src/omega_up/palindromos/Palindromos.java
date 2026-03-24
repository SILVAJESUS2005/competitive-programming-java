import java.util.*;

public class Palindromos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = (n + 1) / 2;

        long[] dp = new long[m + 2];

        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i <= m; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[m]);
    }
}