
package baekjoon.step_by_step.step_06;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	1157. 단어 공부
	알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
	단, 대문자와 소문자를 구분하지 않는다.
	첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
	첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
	단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/


// 문자들의 빈도수를 나타내기 위한 배열을 하나 선언하고 문자열 s 를 입력받는다. 이때 배열의 0 번째 원소는 A 를 의미
// 문자열 s 에 대하여 첫 번째 문자부터 마지막 문자까지 검사하기 위한 반복문을 작성
// 반복문을 돌면서 해당 문자가 어떤 문자냐에 따라 해당 배열 원소를 증가
// 배열의 원소들의 값을 비교하여 가장 큰 값을 갖고있는 인덱스의 문자를 출력
// 배열들을 순회하기 위한 반복문을 작성
// 배열 원소 값이 max 보다 클 경우는 해당 원소값으로 max 를 대치해주고, ch 의 문자를 해당 인덱스에 대응하는 문자로 대치
public class step_06_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int[] arr = new int[26]; // 영문자의 개수는 26개임
		String s = in.next();
 
		for (int i = 0; i < s.length(); i++){
 
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
				arr[s.charAt(i) - 'A']++;	// 해당 인덱스의 값 1 증가
			}
    
			else {	// 소문자 범위
				arr[s.charAt(i) - 'a']++;
			}
		}
 
 
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		in.close();
		System.out.print(ch);

	}

}

class step_06_05_01 {

	public static void main(String[] args) throws IOException{
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // 영문자의 개수는 26개임
		String s = br.readLine();
		
 
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				arr[s.charAt(i) - 97]++;
			} else {
				arr[s.charAt(i) - 65]++;
			}
		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} 
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}

}

//  문자열 변수를 만들지 말고 입력과 동시에 byte 값으로 반환하여 배열의 원소를 증가시키는 방법
// 배열을 순회하여 max 값을 찾으면서 문자를 저장할 때 최악의 경우 캐스팅을 26번 해주어야하므로 일단 int 값으로 저장한 뒤 마지막 출력에서만 캐스팅
class step_06_05_02 {

	public static void main(String[] args) throws IOException {
		 
		int[] arr = new int[26]; // 영문자의 개수는 26개임
 
		int c = System.in.read();
 
		while (c > 64) {	// 공백을 입력받는 순간 종료됨 
			
			if (c < 91) {
				arr[c - 65]++;
			} else {
				arr[c - 97]++;
			}
			c = System.in.read();
		}
 
 
		int max = -1;
		int ch = -2;	// ? 는 63 이다.
 
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				ch = i;
			} else if (arr[i] == max) {
				ch = -2;
			}
		}
		System.out.print((char) (ch+65));
	}

}

// 알고리즘 참고 : https://st-lab.tistory.com/64
