import java.io.FilterOutputStream;
import java.util.Scanner;

public class Acmipc1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        int count = 0;  // 반복횟수
        int digitTwo = 0;   // 두 번째 자릿수 저장
        int digitOne = 0;   // 첫 번째 자릿수 저장
        int temp = N; // 계산 결과를 저장할 공간

        while (true) {
            count++;
            digitOne = temp % 10;   // 첫 번째 자릿수 저장, 0 - 9의 숫자는 그대로 값이 저장됩니다.
            digitTwo = temp / 10;   // 두 번째 자릿수 저장, 0 - 9의 숫자는 0 의 값이 저장됩니다.
            temp = digitOne + digitTwo; //  두 수의 합
            temp = digitOne * 10 + temp % 10;   // 십의 자리로 변경 + 일의 자리로 변경

            if (temp == N) break;   // 두 수가 같을 경우 중단
        }
        System.out.println(count);
    }
}
