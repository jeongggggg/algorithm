package baekjoon.step_by_step;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	14681. 사분면 고르기

/*
	14681. 사분면 고르기
	흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
	사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
	예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 
	점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

	첫 줄에는 정수 x가 주어진다. (-1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (-1000 ≤ y ≤ 1000; y ≠ 0)

*/

public class step_02_04 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		in.close();
        
		int X = in.nextInt();
		int Y = in.nextInt();
		
		if(X > 0) {
			if(Y > 0) {
				System.out.print(1);
			} 
			else {
				System.out.print(4);
			}
		} 
		
		else {
			if(Y > 0) {
				System.out.print(2);
			} 
			else {
				System.out.print(3);
			}
		}
	}
}

class step_02_04_02 {

	 public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		
		if(X > 0) {
			if(Y > 0) {
				System.out.print(1);
			} 
			else {
				System.out.print(4);
			}
		} 
		
		else {
			if(Y > 0) {
				System.out.print(2);
			} 
			else {
				System.out.print(3);
			}
		}
	}
}