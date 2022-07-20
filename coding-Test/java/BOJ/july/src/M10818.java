import java.util.Scanner;

public class M10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int numbersMax;
        int numbersMin;


        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();


        numbersMax = numbers[0];
        numbersMin = numbers[0];

        for (int i : numbers) {
            if ( numbersMax <= i) { numbersMax = i; }
            if ( numbersMin >= i) { numbersMin = i; }
        }
        System.out.printf("%d %d", numbersMin, numbersMax);
    }
}
