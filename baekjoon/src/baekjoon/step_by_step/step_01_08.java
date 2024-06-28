package baekjoon.step_by_step;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

/*
	18108. 1998년생인 내가 태국에서는 2541년생?!
	ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다. 
	공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
	불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다. 
	반면, 우리나라는 서기 연도를 사용하고 있다. 
	불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
*/ 


public class step_01_08 {
	
	// Scanner 사용
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		
		System.out.println(year - 543);
		
		in.close();
	}
	
	// BufferedReader 사용
	/*
	 	public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String s = br.readLine();	// 한 줄을 읽고 문자열로 반환함
			int year = Integer.parseInt(s);	// 반환 된 문자열을 정수로 바꿔줌
			
			System.out.println(year - 543);
		}
	 */

}
