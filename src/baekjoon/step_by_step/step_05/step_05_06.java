package baekjoon.step_by_step.step_05;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	10809. 알파벳 찾기 
	
	문제 : 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
	각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
	포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
	
	입력 : 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
	
	출력 : 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
		  만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
*/

//입력으로 주어지는 문자열은 알파벳 소문자로만 이루어져 있다.
//a ~ z 를 모두 출력하여 주어진 문자열에 대해 해당 문자가 처음으로 나오는 위치를 출력한다.
//위치는 0 부터 시작한다. 즉 문자열 첫 단어는 위치가 0 이다. 

public class step_05_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		in.close();
		 
		 
		// 먼저 int 형 배열을 하나 생성하여 모두 -1 로 초기화 시킨다.
		// 이 배열은 문자열 S 에 각 문자의 위치를 가리킬 배열이다.
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String S = in.nextLine(); //  S 이라는 문자열이 주어진다.
		
		// 반목문을 통해 문자열의 각 문자를 검사하여야 한다. 
		// charAt() 이라는 메소드를 사용하여 문자를 추출한 뒤 ch 라는 변수에 저장
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		} 

	}
}

class step_05_06_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String S = br.readLine();
 
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}
	}
}
// 설명 참고 https://st-lab.tistory.com/62 