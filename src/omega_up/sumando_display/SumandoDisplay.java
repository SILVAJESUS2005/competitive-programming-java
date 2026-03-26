import java.io.*;

public class SumandoDisplay {

    static String[][] digitos = {
            {"###", "# #", "# #", "# #", "###"}, // 0
            {"  #", "  #", "  #", "  #", "  #"}, // 1
            {"###", "  #", "###", "#  ", "###"}, // 2
            {"###", "  #", "###", "  #", "###"}, // 3
            {"# #", "# #", "###", "  #", "  #"}, // 4
            {"###", "#  ", "###", "  #", "###"}, // 5
            {"###", "#  ", "###", "# #", "###"}, // 6
            {"###", "  #", "  #", "  #", "  #"}, // 7
            {"###", "# #", "###", "# #", "###"}, // 8
            {"###", "# #", "###", "  #", "###"}  // 9
    };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] entrada = br.readLine().split(" ");
        String numero = entrada[0];
        char simbolo = entrada[1].charAt(0);

        for (int fila = 0; fila < 5; fila++) {
            StringBuilder linea = new StringBuilder();

            for (int i = 0; i < numero.length(); i++) {
                int d = numero.charAt(i) - '0';

                String parte = digitos[d][fila].replace('#', simbolo);

                linea.append(parte);

                if (i != numero.length() - 1) {
                    linea.append(" ");
                }
            }

            System.out.println(linea.toString());
        }
    }
}