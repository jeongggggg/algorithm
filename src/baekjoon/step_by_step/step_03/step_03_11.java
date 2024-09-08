package baekjoon.step_by_step.step_03;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	10952. A+B - 5
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	입력은 여러 개의 테스트 케이스로 이루어져 있다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	입력의 마지막에는 0 두 개가 들어온다.
*/


// while ( true ) 로 무한 반복 하면서 만약 A 와 B 가 둘 다 0 일경우 break; 를 통해 반복문을 종료해주고, 아닐경우 입력받은 A 와 B 를 더해준다.
public class step_03_11 {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
				
		while(true){
		
			int A=in.nextInt();
			int B=in.nextInt();
		
			if(A==0 && B==0){
				in.close();
				break;
			}
			System.out.println(A+B);
		}

	}

}

/*
 * BufferedReader.readLine() 을 통해 입력 받게 되는데, 
 * 이는 문자열 한 줄을 한 번에 입력받기 때문에 공백까지 입력되어버린다. 
 * 그렇기 때문에 공백을 기준으로 문자열을 분리해주어야 한다.
 * 
 * 문자열 분리 방법에는
 * String.split() 을 통해 분리해주는 방법, 
 * StringTokenizer 로 분리되어 저장하면서 꺼내오는 방법이 있다
 * 
 * StringTokenizer 을 통해 문자열 분리한 뒤 꺼내오는 메소드, 
 * st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜주어야 한다
 * 
*/
class step_03_11_01 {
	
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
	}
	
}

/*
 * 입력방법이 한 자리 수이니 공백의 위치는 고정이라는 점을 이용하여 풀 수도 있다.
 * 또한 StringTokenizer 을 계속 생성해줄 필요 없으니 성능 측면에서 좀 더 이점을 보일 것
 * 
*/
class step_03_11_02 {
	
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String str = br.readLine();
			
			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - 48;
            
			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
	}
	
}