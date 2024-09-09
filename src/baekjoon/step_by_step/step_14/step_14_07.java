package baekjoon.step_by_step.step_14;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
    1269. 대칭 차집합
    문제
    자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다. 이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오.
    두 집합 A와 B가 있을 때, (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합이라고 한다.
    예를 들어, A = { 1, 2, 4 } 이고, B = { 2, 3, 4, 5, 6 } 라고 할 때,  A-B = { 1 } 이고, B-A = { 3, 5, 6 } 이므로,
    대칭 차집합의 원소의 개수는 1 + 3 = 4개이다.

    입력
    첫째 줄에 집합 A의 원소의 개수와 집합 B의 원소의 개수가 빈 칸을 사이에 두고 주어진다.
    둘째 줄에는 집합 A의 모든 원소가, 셋째 줄에는 집합 B의 모든 원소가 빈 칸을 사이에 두고 각각 주어진다.
    각 집합의 원소의 개수는 200,000을 넘지 않으며, 모든 원소의 값은 100,000,000을 넘지 않는다.

    출력
    첫째 줄에 대칭 차집합의 원소의 개수를 출력한다.
*/
public class step_14_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 집합 A와 B의 원소 개수를 입력받음
        int aSize = sc.nextInt();
        int bSize = sc.nextInt();

        // 집합 A와 B 생성
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // 집합 A의 원소 입력
        for (int i = 0; i < aSize; i++) {
            setA.add(sc.nextInt());
        }

        // 집합 B의 원소 입력
        for (int i = 0; i < bSize; i++) {
            setB.add(sc.nextInt());
        }

        // A-B와 B-A 구하기
        Set<Integer> symmetricDifference = new HashSet<>(setA);
        symmetricDifference.removeAll(setB); // A-B

        Set<Integer> tempSet = new HashSet<>(setB);
        tempSet.removeAll(setA); // B-A

        // A-B와 B-A의 합집합이 대칭 차집합
        symmetricDifference.addAll(tempSet);

        // 대칭 차집합의 원소 개수 출력
        System.out.println(symmetricDifference.size());
    }
}
