package baekjoon.category.number_theory;

import java.util.Scanner;

// 15736. 청기 백기
public class _15736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        // 완전제곱수의 개수 = sqrt(N)
        long answer = (long) Math.sqrt(N);

        System.out.println(answer);
    }
}
