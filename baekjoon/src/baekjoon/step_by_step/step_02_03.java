package baekjoon.step_by_step;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

/*
	2753. ����
	������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
	���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
	1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
	������, 2000���� 400�� ����̱� ������ �����̴�.
	
	ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
*/

public class step_02_03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int y = in.nextInt();
		in.close();
        
		if(y%4==0) {
			if(y%400==0) System.out.println("1");
			else if(y%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
		
		
		// ���� ������ ���
		/* Scanner in = new Scanner(System.in);
		
		int y = in.nextInt();
		in.close();
        
		System.out.print((y%4==0)?((y%400==0)?"1":(y%100==0)?"0":"1"):"0"); */

	}
	
	/* 
	 public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int y = Integer.parseInt(br.readLine());
		
		if(y%4==0) {
			if(y%400==0) System.out.println("1");
			else if(y%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
		
		
		//���� ������ ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int y = Integer.parseInt(br.readLine());
		
		System.out.print((y%4==0)?((y%400==0)?"1":(y%100==0)?"0":"1"):"0");
	} 
	*/

}
