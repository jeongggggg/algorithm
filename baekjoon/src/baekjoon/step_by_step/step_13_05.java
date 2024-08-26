package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

/*
	10989. 수 정렬하기 3
	N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
	첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
	첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
*/

public class step_13_05 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 줄에서 숫자의 개수 N을 입력받음
        int N = Integer.parseInt(br.readLine());
        
        // 주어진 수의 범위가 1부터 10,000까지이므로 크기 10,001의 배열을 선언
        int[] count = new int[10001];
        
        // N개의 수를 입력받아 해당 수의 인덱스에 값을 1씩 증가
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }
        
        // 카운팅 배열을 이용해 결과를 오름차순으로 출력
        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                bw.write(i + "\n");
                count[i]--;
            }
        }
        
        bw.close();
    }
}
