package baekjoon.category.data_structure;
import java.util.*;

/*
    1158. 요세푸스 문제
    요세푸스 문제는 다음과 같다.
    1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
    이제 순서대로 K번째 사람을 제거한다.
    한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
    이 과정은 N명의 사람이 모두 제거될 때까지 계속된다.
    원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다.
    예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
    N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

    첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)

    예제와 같이 요세푸스 순열을 출력한다.
*/

public class _1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 사람 수
        int K = scanner.nextInt(); // 제거할 순번

        // 1. 리스트 초기화
        List<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        List<Integer> result = new ArrayList<>();
        int index = 0;

        // 2. 요세푸스 순열 생성
        while (!circle.isEmpty()) {
            index = (index + K - 1) % circle.size(); // K번째 사람의 인덱스 계산
            result.add(circle.remove(index)); // K번째 사람 제거 및 결과에 추가
        }

        // 3. 결과 출력
        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }
}
