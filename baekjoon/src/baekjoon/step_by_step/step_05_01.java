package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 	27866. 문자와 문자열 
 	단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
 	
 	첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 
 	단어의 길이는 최대 1,000이다. 둘째 줄에 정수 i가 주어진다
*/

public class step_05_01 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		int n = sc.nextInt()-1;
		
		System.out.println(st.charAt(n));
		
		sc.close();
	}

}

class step_05_01_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		int n = Integer.parseInt(br.readLine())-1;
		
		br.close();
		
		System.out.println(st.charAt(n));
	}
}