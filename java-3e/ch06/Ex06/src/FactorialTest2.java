public class FactorialTest2 {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int i) {    // 팩토리얼
        int result = 1;

        while (i != 0) {
            result *= i--;
        }
        return result;
    }
}



