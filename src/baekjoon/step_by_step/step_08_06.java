package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
	1193. 분수찾기 
	이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
	X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
	
	첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
	
	첫째 줄에 분수를 출력한다.
*/

/*
 	알고리즘
 	1.  대각선 칸의 개수는 T - 1 개
 	2. 파란색 ( T 가 짝수, 또는 대각선 칸의 개수가 홀수 ) 일 때는 왼쪽 아래에서 오른쪽 위 방향 ( ↗︎ ) 으로 진행
 	3. 빨간색 ( T 가 홀수, 또는 대각선 칸의 개수가 짝수 ) 일 때는 오른쪽 위에서 왼쪽 아래 방향 ( ↙︎ ) 으로 진행
 	4. T % 2 가 0 일 때는 대각선 위 방향, 1 일 때는 아래 방향으로 진행
 	5. 사용할 변수 : 입력받을 X 값, 해당 범위의 대각선 칸 개수 ( cross_count ), 해당 대각선 직전 대각선 까지의 칸의 누적 합 ( prev_count_sum )
 	6. 3 개를 이용하여 X 값이 해당 범위의 값이 나올 때 까지 반복
 	7. 해당 범위의 값이라면 대각선의 개수가 홀수인지, 짝수인지 판별하여 해당 대각선의 첫 원소와 X, 대각선의 개수를 이용하여 분모 분자 값을 구함
 	
 	 직전 대각선까지의 누적합과 X 의 차이를 이용하면 해당 대각선에서 몇 번째의 분수인지 알 수 있고,
	 이를 대각선의 개수를 이용하여 짜는 알고리즘 
*/
public class step_08_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
 
		int cross_count = 1, prev_count_sum = 0;
		
		in.close();
		while (true) {
        
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// 대각선상의 블럭의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}

	}

}

// br.readLine() 은 문자열로 데이터를 읽으니 반드시 꺼내서 쓸 때 int 형으로 쓰고자 한다면 Integer.parseInt()로 String 을 int 형으로 변환

class step_08_06_01{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
 
		int cross_count = 1, prev_count_sum = 0;
 
		while (true) {
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 블럭의 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// 대각선의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}
