package baekjoon.step_by_step.step_08;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	2292. 벌집  
	위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 
	그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
	숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
	예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
	
	첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
	
	입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
*/

// N = 1 일 때는 1 개의 방을, N = 2 일 때는 2 개의 방을, ⋯ 이런식으로 N 번 까지 갈 때 최소 개 수의 루트로 방을 방문하면 되는 것 
// 방 개수는 6개씩 늘어난다. 


// N 이 1 일경우 바로 1을 출력하면 되고,
// 그 외에는 range (범위)가 N 을 넘기 직전까지 최솟값 range를 계속 증가시켜주는 것
// 그리고 count 를 1 증가
// 만약 최솟값 범위가 N 을 넘어가면 해당 범위가 아니게 되므로 자연스레 반복문은 종료되는 원리
public class step_08_05 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		
		in.close();
 
		int N = in.nextInt();
		int count = 1; // 겹 수(최소 루트)
		int range = 2;	// 범위 (최솟값 기준) 
 
		if (N == 1) {
			System.out.print(1);
		}
 
		else {
			while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복 
				range = range + (6 * count);	// 다음 범위의 최솟값으로 초기화 
				count++;	// count 1 증가 
			}
			System.out.print(count);
		}
	}

}

class step_08_05_01 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		int count = 1; // 겹 수(최소 루트)
		int range = 2;	// 범위 (최솟값 기준) 
 
		if (N == 1) {
			System.out.print(1);
		}
 
		else {
			while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복 
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
		}
	}

}
