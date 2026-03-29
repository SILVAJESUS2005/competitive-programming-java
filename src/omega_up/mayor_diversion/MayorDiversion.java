import java.io.*;

public class MayorDiversion {

    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1 << 16];
    static int ptr = 0, len = 0;

    public static void main(String[] args) throws Exception {
        int n = nextInt();

        int suma = 0;
        int minimo = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            int x = nextInt();
            suma += x;
            if(x < minimo) minimo = x;
        }

        System.out.println(suma - minimo);
    }

    static int read() throws IOException {
        if (ptr >= len) {
            len = in.read(buffer);
            ptr = 0;
            if (len <= 0) return -1;
        }
        return buffer[ptr++];
    }

    static int nextInt() throws IOException {
        int c, sign = 1, num = 0;

        // saltar espacios
        do {
            c = read();
        } while (c <= ' ');

        // signo
        if (c == '-') {
            sign = -1;
            c = read();
        }

        // número
        while (c > ' ') {
            num = num * 10 + (c - '0');
            c = read();
        }

        return num * sign;
    }
}