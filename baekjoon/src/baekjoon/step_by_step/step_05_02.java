package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	2743.단어 길이 재기 
	알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
	
	첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

	첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
*/


public class step_05_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		sc.close();
		
		System.out.println(st.length());
	}
}

class step_05_02_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		br.close();
				
		System.out.println(st.length());
	}
}