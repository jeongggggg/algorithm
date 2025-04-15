package baekjoon.category.number_theory;

import java.util.*;

// 24039. 2021은 무엇이 특별할까?

public class _24039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= 300; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        // 연속된 소수의 곱을 하나씩 계산해서, N보다 큰 첫 값 찾기
        for (int i = 0; i < primes.size() - 1; i++) {
            int a = primes.get(i);
            int b = primes.get(i + 1);
            int product = a * b;
            if (product > N) {
                System.out.println(product);
                break;
            }
        }
    }

    // 소수 판별 함수
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
