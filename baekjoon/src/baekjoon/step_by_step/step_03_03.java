package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	8393. 합
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
*/


public class step_03_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int a = in.nextInt();
		in.close();
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}

class step_03_03_01 {

	public static void main(String[] args) throws IOException {
	        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		br.close();
		int s = 0;
 
		for( int i = 1 ; i <= N ; i++ ) s+=i;
 
		System.out.println(s);
	}
}

class step_03_03_02 {

	public static void main(String[] args) throws IOException {
	        
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int s = 0;
        
		for( int i = 1 ; i <= N ; i++ ) s+=i;
 
		System.out.println(s);
	}
}
