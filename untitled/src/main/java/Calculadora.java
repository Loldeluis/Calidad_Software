public class Calculadora {
    public int sumar(int a, int b) {
        return a+b;
    }

    public int dividir(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir entre 0");
            return a/b;

    }
}
