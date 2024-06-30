package baekjoon.step_by_step;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

/*
	9498. 시험 성적
	시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	
	첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
*/

public class step_02_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		in.close();
		
		if(A>=90) System.out.println("A");
		else if(A>=80) System.out.println("B");
		else if (A>=70) System.out.println("C");
		else if(A>=60) System.out.println("D");
		else System.out.println("F");
		
		/* 삼항연산자 사용
		 Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		in.close();
		
		System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
		*/
	}
	
	/*
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		int A = Integer.parseInt(br.readLine());
        
		if(A>=90) System.out.println("A");
		else if(A>=80) System.out.println("B");
		else if (A>=70) System.out.println("C");
		else if(A>=60) System.out.println("D");
		else System.out.println("F");
		
		// 삼항연산자 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
 		int A = Integer.parseInt(br.readLine());
        
		System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
	} 
	*/

}
