public class Calculadora {
    int a, b;

    public int sumar (int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.sumar(10,5));
    }
}