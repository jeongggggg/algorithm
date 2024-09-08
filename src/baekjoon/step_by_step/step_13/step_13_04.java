package baekjoon.step_by_step.step_13;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

/*
	2751. 수 정렬하기 2
	N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
	
	첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
	
	첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다
*/

public class step_13_04 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에 수의 개수 N을 입력
        int N = Integer.parseInt(br.readLine());
        
        // N개의 수를 저장할 배열
        int[] numbers = new int[N];

        // N개의 수를 입력받아 배열에 저장
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);

        // 정렬된 결과를 출력
        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(num).append('\n');
        }
        System.out.print(sb);
    }
}
