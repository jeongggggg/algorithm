package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	24313. 알고리즘 수업 - 점근적 표기 1
	오늘도 서준이는 점근적 표기 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
	알고리즘의 소요 시간을 나타내는 O-표기법(빅-오)을 다음과 같이 정의하자.
	O(g(n)) = {f(n) | 모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다}
	이 정의는 실제 O-표기법(https://en.wikipedia.org/wiki/Big_O_notation)과 다를 수 있다.
	함수 f(n) = a1n + a0, 양의 정수 c, n0가 주어질 경우 O(n) 정의를 만족하는지 알아보자.
	
	첫째 줄에 함수 f(n)을 나타내는 정수 a1, a0가 주어진다. (0 ≤ |ai| ≤ 100)
	다음 줄에 양의 정수 c가 주어진다. (1 ≤ c ≤ 100)
	다음 줄에 양의 정수 n0가 주어진다. (1 ≤ n0 ≤ 100)
	
	f(n), c, n0가 O(n) 정의를 만족하면 1, 아니면 0을 출력한다.
*/

public class step_11_08 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        // 첫번째 조건: a1 <= c
        if (a1 > c) {
            System.out.println(0);
        } else {
            // 두번째 조건: (a1 - c) * n0 + a0 <= 0
            if (a1 * n0 + a0 <= c * n0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}


class step_11_08_01 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 값을 공백으로 분리하여 읽기
        String[] input = br.readLine().split(" ");
        int a1 = Integer.parseInt(input[0]);
        int a0 = Integer.parseInt(input[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // 첫 번째 조건: a1 <= c
        if (a1 > c) {
            System.out.println(0);
        } else {
            // 두 번째 조건: a1 * n0 + a0 <= c * n0
            if (a1 * n0 + a0 <= c * n0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}