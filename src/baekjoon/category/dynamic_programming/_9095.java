package baekjoon.category.dynamic_programming;

import java.util.Scanner;

/*
    9095. 1, 2, 3 더하기
    정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
    1+1+1+1
    1+1+2
    1+2+1
    2+1+1
    2+2
    1+3
    3+1
    정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

    첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.

    각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
*/
public class _9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수 입력
        int T = sc.nextInt();

        // dp 배열 선언 및 초기값 설정
        int[] dp = new int[12]; // n은 최대 11
        dp[1] = 1; // 1을 나타내는 방법: 1
        dp[2] = 2; // 2를 나타내는 방법: 1+1, 2
        dp[3] = 4; // 3을 나타내는 방법: 1+1+1, 1+2, 2+1, 3

        // 점화식을 기반으로 dp 배열 채우기
        for (int i = 4; i <= 11; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // 각 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt(); // n 입력
            System.out.println(dp[n]); // n을 나타내는 방법의 수 출력
        }

        sc.close();
    }
}
