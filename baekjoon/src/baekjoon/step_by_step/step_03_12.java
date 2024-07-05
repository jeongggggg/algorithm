package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	10951. A+B - 4
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	입력은 여러 개의 테스트 케이스로 이루어져 있다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	
	※ 주의할 점
	- 두 정수는 공백으로 나뉘어 구분된다.
	- 입력의 종료는 더이상 읽을 수 있는 데이터 (EOF) 가 없을 때 종료한다.
	
	※ EOF 란?
	이 문제에서 가장 중요한 점이 파일 종료 조건이 없이 그냥 입력이 주어졌다는 것.
	즉 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료하라는 것이다.
	이렇게 데이터가 더이상 존재하지 않을 때 우리는 EOF (End of File) 즉, 파일의 끝이라 한다.
*/

/*
  	입력이 아예 들어오지 않기 때문에 예외가 발생하는 형태는 같기 때문에
	hasNextInt(), hasNext() 둘 중 아무거나 써도 괜찮지만,
	그래도 nextInt() 를 통해 정수를 입력받고자 했으니 
	hasNextInt() 를 써주는게 다른 코딩할 때도 착오가 발생하지 않는다.
	참고로 hasNextInt() 의 경우 입력값이 정수일경우 true를 반환하며 
	정수가 아닐경우 바로 예외를 던지며 더이상의 입력을 받지 않고 hasNextInt()에서 false를 반환하면서
	반복문이 종료된다.
*/
public class step_03_12 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(in.hasNextInt()){
		
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println(a+b);
		
		}	
		in.close();
	}

}

/*
	문자열 분리 방법에는
	1. StringTokenizer 클래스를 이용하여 분리해주는 방법
	2. split() 을 이용하는 방법
	이 있으며, StringTokenizer 가 특정 상황이 아니면 성능면에서 훨씬 우월함
	반드시 자료형 타입을 잘 보아야 한다.
	st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다.
	 readLine() 을 통해 입력을 하여 str 에 저장된 데이터가 null 일 경우 
	 while 반복문을 종료시켜버리고 아닐경우 반복문을 계속 수행하도록 한다.
*/

class step_03_12_01 {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
 
		while( (str=br.readLine()) != null ){
		    
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		
		}
		System.out.print(sb);
	}
}

/*
	정수의 조건을 보았을 때 한자릿수 정수만 입력받음으로 공백("")의 위치도 항상 고정된 위치라는 것을 알 수 있다.
	객체생성을 안하고 빠르게 작성하는 방법으로는 charAt() 가 있다.
*/
class step_03_12_02 {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
 
		while( (str=br.readLine()) != null ){
		    
			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			sb.append(a+b).append("\n");
		
		}
		System.out.print(sb);
	}
}

// 참고 : https://st-lab.tistory.com/40