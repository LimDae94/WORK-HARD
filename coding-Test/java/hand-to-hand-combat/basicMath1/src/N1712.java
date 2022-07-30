import java.util.Scanner;

public class N1712 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        if (B >= C) {
            System.out.println(-1);
        } else {
            System.out.println((A / (C - B)) + 1);
        }
    }
}
