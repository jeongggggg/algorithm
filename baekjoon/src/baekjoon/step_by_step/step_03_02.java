package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	10950. A+B - 3
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
*/

public class step_03_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int c = in.nextInt();
		int arr[] = new int[c];
 
		for (int i = 0; i < c; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			arr[i] = a + b;
		}
		in.close();
 
		for (int k : arr) {
			System.out.println(k);
		}
	}

}

class step_03_02_01 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
 
		System.out.println(sb);
	}

}