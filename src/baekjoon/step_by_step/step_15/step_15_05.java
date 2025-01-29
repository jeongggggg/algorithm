package baekjoon.step_by_step.step_15;

import java.util.Scanner;

/* 4134. 다음 소수
    문제
    정수 n(0 ≤ n ≤ 4*109)가 주어졌을 때, n보다 크거나 같은 소수 중 가장 작은 소수 찾는 프로그램을 작성하시오.

    입력
    첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.

    출력
    각각의 테스트 케이스에 대해서 n보다 크거나 같은 소수 중 가장 작은 소수를 한 줄에 하나씩 출력한다.
 */
public class step_15_05 {
    // 소수 판별 메서드
    public static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false; // 짝수는 소수 아님 (2 제외)

        long sqrt = (long) Math.sqrt(num);
        for (long i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        while (T-- > 0) {
            long n = sc.nextLong();

            // n 이상 첫 번째 소수 찾기
            while (!isPrime(n)) {
                n++;
            }
            System.out.println(n);
        }
        sc.close();
    }
}
