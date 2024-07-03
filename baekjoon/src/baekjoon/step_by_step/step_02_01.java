package baekjoon.step_by_step;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	1330. 두 수 비교하기
	문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
	입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
	
	출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
		- A가 B보다 큰 경우에는 '>'를 출력한다.
		- A가 B보다 작은 경우에는 '<'를 출력한다.
		- A와 B가 같은 경우에는 '=='를 출력한다.
*/

public class step_02_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
        
		if(A>B) System.out.println(">");
		else if(A<B) System.out.println("<");
		else System.out.println("==");

	}
}

//BufferedReader 사용
class step_02_01_01 {
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
	}
}

//굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.
class step_02_01_02 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" )); 
	}
}

//삼항연산자 사용
class step_02_01_03 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));

	}
}
