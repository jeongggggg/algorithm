package baekjoon.step_by_step;
import java.util.HashSet;
import java.util.Scanner;

/*
    14425. 문자열 집합
    문제
    총 N개의 문자열로 이루어진 집합 S가 주어진다.

    입력으로 주어지는 M개의 문자열 중에서 집합 S에 포함되어 있는 것이 총 몇 개인지 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 문자열의 개수 N과 M (1 ≤ N ≤ 10,000, 1 ≤ M ≤ 10,000)이 주어진다.
    다음 N개의 줄에는 집합 S에 포함되어 있는 문자열들이 주어진다.
    다음 M개의 줄에는 검사해야 하는 문자열들이 주어진다.
    입력으로 주어지는 문자열은 알파벳 소문자로만 이루어져 있으며, 길이는 500을 넘지 않는다. 집합 S에 같은 문자열이 여러 번 주어지는 경우는 없다.

    출력
    첫째 줄에 M개의 문자열 중에 총 몇 개가 집합 S에 포함되어 있는지 출력한다.
*/

public class step_14_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N과 M 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();  // 개행 문자 제거

        // 집합 S 생성 및 입력 받기
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            set.add(s);
        }

        // 검사해야 할 문자열 확인
        int count = 0;
        for (int i = 0; i < M; i++) {
            String s = sc.nextLine();
            if (set.contains(s)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
