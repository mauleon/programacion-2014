package fibonaccirecursivo;

public class FibonacciRecursivo {

    static int fib(int n) {

        if (n > 2) {
            return fib(n - 1) + fib(n - 2);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        System.out.println("El fib(6) es: " + fib(100));

    }

}
