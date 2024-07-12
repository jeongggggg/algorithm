package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	2908.상수
	상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
	이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
	상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
	상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 
	상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
	두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
	
	첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 
	두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
*/


// Scanner + StringBuilder.reverse();
public class step_05_09 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
        // StringBuilder 생성과 동시에 append() 라는 메소드에 값에 넣어줌
        // append() 로 넣어진 값은 타입이 StringBuilder 로 변환
        // 저장된 수를 reverse() 라는 메소드를 통해 저장되어있던 문자열을 뒤집
        // StringBuilder 타입을 문자열로 반환시키기 위해 toString() 
        // Integer.parseInt() 로 String 을 int 로 타입을 변경
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		//  A 와 B 중 큰 값이 출력
		System.out.print(A > B ? A : B);
	
	}

}

// BufferedReader + StringTokenizer ( split() 도 사용 가능)
// 객체를 생성할 때 문자열 인자를 바로 넣어줄 수 있다는 점이 위 코드와 다르다.
class step_05_09_01{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		// Scanner 을 사용했을 때는 int 타입으로 받았기 때문에 객체를 생성할 때 append() 메소드를 써야했지만 
		// 만약 넣어주려는 인자가 String 타입이면 append() 를 사용할 필요가 없다.
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.print(A > B ? A:B);
	}
}
