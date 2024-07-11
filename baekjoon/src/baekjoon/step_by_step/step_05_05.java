package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 	11720. 숫자의 합 
 	N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 	첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
*/

// Scanner 로 입력받아 charAt() 을 사용하여 푸는 방법
/*
	1. 숫자의 개수인 N 을 입력
	2. 다음 줄에 숫자를 정수가 아닌 String (문자열)로 입력을 받기 
	3. for문을 통해 입력받은 문자열의 첫번째 원소 ( charAt(0) ) 부터
	 	마지막 원소 ( charAt(N) ) 까지 각 원소의 누적 합을 구하기 
	4.  charAt() 은 해당 문자의 아스키코드 값을 반환하므로 
		반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
*/
public class step_05_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		String a = in.next();
		in.close();
		
		int sum = 0;
        
		for(int i = 0; i < N; i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.print(sum);

	}

}

// BufferedReader 로 입력받아 getBytes() 을 이용하여 푸는 방법

/*
 	getBytes() : 문자열을 입력받을 때 해당 문자열을 쉽게 각 자릿값을 반환받을 수 있는 방법으로
 				 String (문자열) 에 대하여 해당 문자열을 하나의 byte 배열로 변환해주는 메소드
 */

/*
	 readLine() 으로 읽어들인 문자를 byte[] 로 변환하여 반환되므로 for-each 구문을 통해 문자열의 문자를 하나하나씩 읽어들일 수 있다.
	UTF-16 인코딩에 맞게 각 문자의 값을 저장하므로 반드시 '0' 또는 48 을 빼주어야 한다.

 
*/
class step_05_05_01 {

	public static void main(String[] args) throws IOException {		
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.
		
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');	// 또는 (a-48)
		}
		
		System.out.print(sum);
		
	}

}

// Scanner 로 입력받아 getBytes() 사용 방법 
class step_05_05_02 {

	public static void main(String[] args) {		
		 
		Scanner in = new Scanner(System.in);
		in.nextInt();
		
		int sum = 0;
		
		for(byte value : in.next().getBytes()) {
			sum += (value - '0');
		}
		
		System.out.print(sum);
		
	}

}
