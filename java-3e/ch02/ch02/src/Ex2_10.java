import java.util.Scanner;

public class Ex2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 클래스 객체의 생성

        System.out.print("두자리 정수를 하나 입력해주세요.>");    // 22
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :" + input);   // 입력내용 :22
        System.out.printf("num=%d%n", num); // num=22
    }
}
