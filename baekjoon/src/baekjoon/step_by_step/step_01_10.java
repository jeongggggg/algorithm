package baekjoon.step_by_step;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	2588. ����
	(�� �ڸ� ��) �� (�� �ڸ� ��) ������ �� ��ġ�� ���� �� �� ���ϱ�.
*/

//Scanner ���
public class step_01_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int A = in.nextInt();
		String B = in.next();
        
		in.close();
 
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
	}
}

//Scanner ���
class step_01_10_01 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int A = in.nextInt();
		int B = in.nextInt();
        
		in.close();
 
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
	}
}

//BufferedReader ���
class step_01_10_02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		br.close();
        
		StringBuilder sb = new StringBuilder();
        
		sb.append(A * (B%10));
		sb.append('\n');
		
		sb.append(A * ((B%100)/10));
		sb.append('\n');
        
		sb.append(A * (B/100));
		sb.append('\n');
        
		sb.append(A * B);
 
		System.out.print(sb);
	}
}

class step_01_10_03 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
 
		char[] b = B.toCharArray();
			
		
		System.out.println(A * (b[2]-'0'));
		System.out.println(A * (b[1]-'0'));
		System.out.println(A * (b[0]-'0'));
		System.out.println(A * Integer.parseInt(B));
 
	}
}
	


