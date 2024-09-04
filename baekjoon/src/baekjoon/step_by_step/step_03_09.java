package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/*
	2438. 별찍기-1
	첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
	첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/

public class step_03_09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

/*
	반드시 자료형 타입을 잘 보아야 한다.
	br.readLine() 은 문자열로 데이터를 읽으니 반드시 꺼내서 쓸 때 
	int 형으로 쓰고자 한다면 Integer.parseInt()로 String 을 int 형으로 변환시켜준다.
*/
class step_03_09_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

// 모든 문자열을 하나의 객체에 연결해준다음 출력은 마지막에 한 번만 해주니 시간을 아낄 수 있는 방법 중 하나
class step_03_09_02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
		StringBuilder sb = new StringBuilder();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}

//  출력 할 문자들이 많아지면 많아질수록 다른 출력 방법들에 비해 매우 우수한 성능을 보여준다.
class step_03_09_03 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				bw.write('*');
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}