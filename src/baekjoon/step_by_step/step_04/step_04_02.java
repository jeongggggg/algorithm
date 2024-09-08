package baekjoon.step_by_step.step_04;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	10871. X보다 작은 수
	문제 : 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
	이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
	
	입력 : 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
	둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
	주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
	
	출력 : X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
*/

// 배열에 입력받은 수열을 다 저장한 뒤 다시 한 번 반복문으로 배열을 검사하여 조건문에 따라 출력
public class step_04_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		int X = in.nextInt();
		int arr[] = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
 
		in.close();
        
		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}

// 배열 사용 X, 입력받음과 동시에 if 문으로 검사해서 주어진 수 보다 작은 경우 StringBuilder 에 저장해주는 방법
class step_04_02_01 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
        
		StringBuilder sb = new StringBuilder();
 
		for(int i = 0 ; i < N ; i++) {
			
			int value = in.nextInt();
			if(value < X) {
				sb.append(value+" ");
			}
		}
		
		in.close();
		System.out.println(sb);	
	}
}

// BufferedReader 로 입력받는만큼 문자열 분리를 해주어야 하기 때문에 StringTokenizer 또한 필요
class step_04_02_02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
 
		StringBuilder sb = new StringBuilder();
 
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
 
			if (value < X)
				sb.append(value).append(' ');
		}
		System.out.println(sb);
	}
}