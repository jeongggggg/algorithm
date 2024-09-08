package baekjoon.step_by_step.step_04;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	1546. 평균 
	세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
	일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
	그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
	예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
	세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
	
	첫째 줄에 시험 본 과목의 개수 N이 주어진다. 
	이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 
	이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
	
	첫째 줄에 새로운 평균을 출력한다. 
	실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
*/

/*
 	※ 주의할 점
	1. 정답과의 상대/절대 오차는 10-2, 즉 0.01 까지 허용한다.
	2. 두 번째 줄에 주어지는 수는 공백을 기준으로 주어진다.
	3. 입력받은 값중 최댓값 M 을 사용하여 모든 점수에 (점수/M)*100 으로 연산한 뒤 새로운 평균을 구해야 한다.
*/
public class step_04_10 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
 
		double arr[] = new double[in.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextDouble();
		}
		in.close();
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}

class step_04_10_01 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		double arr[] = new double[Integer.parseInt(br.readLine())];
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length - 1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}

class step_04_10_02 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine()); //입력 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1;
		double sum = 0.0;
		
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value > max) {
				max = value;
			}
			
			sum += value;
		}
	
		System.out.println(((sum / max) * 100.0) / N);
		
	}
}