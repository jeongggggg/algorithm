package baekjoon.category.parsing;
import java.util.Scanner;
/*
    10953. A+B - 6
    문제
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.

    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)

    출력
    각 테스트 케이스마다 A+B를 출력한다.
 */
public class _10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: 테스트 케이스의 개수 T
        int T = sc.nextInt();
        sc.nextLine();  // 개행 문자 처리

        for (int i = 0; i < T; i++) {
            // 각 테스트 케이스 입력: "A,B" 형식으로 입력받음
            String input = sc.nextLine();
            String[] numbers = input.split(","); // 콤마(,)로 분리

            // A와 B를 정수로 변환하여 더하기
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);

            // A + B 출력
            System.out.println(A + B);
        }

        sc.close();
    }

}
