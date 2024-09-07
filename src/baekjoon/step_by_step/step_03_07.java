package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/*
 	11021. A+B - 7
 	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 	각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
*/

public class step_03_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int a = in.nextInt();
 
		for (int i = 1; i <= a; i++) {
			int c = in.nextInt();
			int d = in.nextInt();
 
			System.out.println("Case #" + i + ": " + (c + d));
		}
 
		in.close();

	}

}

// BufferedReader 사용, 문자열 분리 StringTokenizer 
// 반드시 자료형 타입을 잘 보아야 함. st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환
class step_03_07_01 {

	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			System.out.println("Case #" + i + ": " 
			+(Integer.parseInt(st.nextToken())
			+Integer.parseInt(st.nextToken())));
		}
		br.close();
	}

}

// StringBuilder
class step_03_07_02 {

	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
        
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #").append(i).append(": ")
			.append(Integer.parseInt(st.nextToken())
			+Integer.parseInt(st.nextToken())).append('\n');
			
			// sb.append("Case #"+ i + ": " + (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n" );


		}
		br.close();
		System.out.println(sb);
	}

}

// BufferedWriter
/*
	BufferedWriter.write() 메소드는 단독으로 int 형 값만 넣을경우 이는 아스키 코드값으로 인식되기 때문에 다른 문자가 나와버린다. 
	그러니 이를 방지하고 싶다면 반드시 문자열과 int 형을 함께 넣어줘야 int 값을 제대로 출력할 수 있다.
*/ 
class step_03_07_03 {

	public static void main(String args[]) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write("Case #"+i+": ");
			bw.write(Integer.parseInt(st.nextToken())
				+Integer.parseInt(st.nextToken())+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}

// 참고해서 성능 개선
/*
 	A 와 B 는 "무조건" 한 자릿수만 입력받기 때문에 문자열로 입력받을시 공백이 들어가는 위치는 언제나 고정되어있다.
	그럼 문자열의 특정 위치의 문자를 반환해주는 charAt() 을 쓸 수 있다면 
	StringTokenizer 객체를 계속 생성하지 않아도 되기에 시간이 더욱 단축 될 수 있을 것
	
	실수 할 수 있는 부분이 String.charAt() 은 해당 위치의 문자를 char 로 반환한다.
	즉 만약 0이라는 문자열이 반환되면 아스키 코드값인 48이 반환된다.
	이를 int형으로 연산하려고 하거나 문자 출력이 아닌 정수로 출력하려 하면 0 이라는 숫자가 아닌 48로 출력된다.
	그러니 예로들어 문자 '6' 을 숫자 6 으로 바꾸고 싶다면 48을 빼주면 된다.
	만약 몇을 빼줘야할지 모른다면 -'0' 으로 해도 된다.
*/
class step_03_07_04 {

	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= a; i++) {
			String str = br.readLine();
			sb.append("Case #").append(i).append(": ")
			.append(str.charAt(0)-'0'+str.charAt(2)-'0').append('\n');
		}
		System.out.println(sb);
	}

}

// 참고 : https://st-lab.tistory.com/33