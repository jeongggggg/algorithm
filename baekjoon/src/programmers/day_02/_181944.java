package programmers.day_02;
import java.util.Scanner;

// 홀짝 구분하기
public class _181944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n % 2 == 0 ? n + " is even" : n + " is odd");
    }
}
