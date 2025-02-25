package baekjoon.category.number_theory;

import java.util.Scanner;

// 15633. Fan Death
public class _15633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        // 약수의 합
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        int result = sum * 5 - 24;
        System.out.println(result);
    }
}
