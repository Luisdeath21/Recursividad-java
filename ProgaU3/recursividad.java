package ProgaU3;

public class recursividad {

    public static int suma(int n) {
        if (n == 0) return 0;
        return n + suma(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) return 1;
        return base * potencia(base, exponente - 1);
    }

    public static String invertir(String texto) {
        if (texto.length() == 0) return "";
        return invertir(texto.substring(1)) + texto.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(suma(5));
        System.out.println(fibonacci(7));
        System.out.println(potencia(2, 4));
        System.out.println(invertir("Nadie escapa de la justicia"));
    }
}
