package baekjoon.step_by_step.step_14;
import java.util.HashSet;
import java.util.Scanner;

/*
	10815. 숫자 카드
	문제
	숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 
	이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 
	숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다. 두 숫자 카드에 같은 수가 적혀있는 경우는 없다.
	셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어지며, 
	이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다
	
	출력
	첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.

*/

public class step_14_01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 상근이가 가지고 있는 숫자 카드의 개수 N
        int N = scanner.nextInt();
        HashSet<Integer> cardSet = new HashSet<>();

        // 숫자 카드를 HashSet에 저장
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            cardSet.add(number);
        }

        // M개의 수에 대해서 상근이가 숫자 카드를 가지고 있는지 확인
        int M = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int query = scanner.nextInt();
            if (cardSet.contains(query)) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }

        // 결과 출력
        System.out.println(result.toString().trim());

        scanner.close();
    }
}
