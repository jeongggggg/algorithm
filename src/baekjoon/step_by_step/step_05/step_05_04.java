package baekjoon.step_by_step.step_05;
import java.util.Scanner;
/*
	11654.아스키 코드 
	알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
	주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
	
	알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
	
	입력으로 주어진 글자의 아스키 코드 값을 출력한다.
*/

/*
	Scanner 에는 문자를 받으려면 nextLine() 이나 next() 를 통해 문자열로 입력받아서 charAt() 으로 문자로 잘라내주어야 한다.
	[입력] String 으로 입력받는다.
	-> [charAt()] String 에서 char 로, 즉 문자열을 잘라 문자로 변환한다.
	-> int 타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드값을 저장한다.
*/
public class step_05_04 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
 
		int ch = in.next().charAt(0);
		
		in.close();
        
		System.out.print(ch);
	}

}

/*
	Scanner 를 쓰지 말고, 가장 기초 입력방법인 System.in 을 쓰는 방법
	System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장할 수 있다.
	반드시 주의해야 할 점은 예외처리를 해주어야한다.
	IOException (java.io 패키지를 import 해야함) 로 메인 옆에 써주어도 되고, 
	Exception 으로 처리해도 된다.
*/
class step_05_04_01 {

	public static void main(String[] args) throws Exception {
		 
		int a = System.in.read();
		System.out.print(a);
 
	}

}