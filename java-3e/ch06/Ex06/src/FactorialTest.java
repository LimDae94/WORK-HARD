public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int i) {
        int result = 0;
        if (i == 1) {
            result = 1;
        } else {
            result = i * factorial(i - 1);
        }
        return result;
    }
}
