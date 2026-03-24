import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class MultiplicacionBinaria {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        BigInteger resultado = num1.multiply(num2);

        System.out.println(resultado.toString(2));
    }
}