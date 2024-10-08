package baekjoon.step_by_step.step_09;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;

/*
	5086. 배수와 약수 
	4 × 3 = 12이다.
	이 식을 통해 다음과 같은 사실을 알 수 있다.
	3은 12의 약수이고, 12는 3의 배수이다.
	4도 12의 약수이고, 12는 4의 배수이다.
	두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
	1. 첫 번째 숫자가 두 번째 숫자의 약수이다.
	2. 첫 번째 숫자가 두 번째 숫자의 배수이다.
	3. 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
	
	입력은 여러 테스트 케이스로 이루어져 있다. 
	각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다. 
	마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.
	
	각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 
	배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.

*/

public class step_09_01 {

	public static void main(String[] args) throws IOException {
		 
		String f = "factor\n";
		String m = "multiple\n";
		String n = "neither\n";
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
 
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			if(first == 0 && second == 0) break;
			
			if(second % first == 0) {
				sb.append(f);
			}
			else if(first % second == 0) {
				sb.append(m);
			}
			else {
				sb.append(n);
			}
			
		}
		System.out.println(sb);
	}

}

class step_09_01_01 {

	public static void main(String[] args) {
	    
		String f = "factor\n";
		String m = "multiple\n";
		String n = "neither\n";
        
		Scanner in = new Scanner(System.in);
        
		StringBuilder sb = new StringBuilder();
        
		in.close();
 
		while(true) {
			
			int first = in.nextInt();
			int second = in.nextInt();
			
			if(first == 0 && second == 0) break;
			
			if(second % first == 0) {
				sb.append(f);
			}
			else if(first % second == 0) {
				sb.append(m);
			}
			else {
				sb.append(n);
			}
		}
		System.out.println(sb);
	}

}

class step_09_01_02 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
        
		in.close();
		
		while(true) {
			
			int first = in.nextInt();
			int second = in.nextInt();
			
			if(first == 0 && second == 0) break;
			
			if(second % first == 0) {
				System.out.println("factor");
			}
			else if(first % second == 0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
 
	}

}
