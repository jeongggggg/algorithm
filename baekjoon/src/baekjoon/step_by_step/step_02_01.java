package baekjoon.step_by_step;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	1330. �� �� ���ϱ�
	���� : �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	�Է� : ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
	
	��� : ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
		- A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
		- A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
		- A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
*/

public class step_02_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
        
		if(A>B) System.out.println(">");
		else if(A<B) System.out.println("<");
		else System.out.println("==");

	}
}

//BufferedReader ���
class step_02_01_01 {
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
	}
}

//���� String ���� ���� ���ϰ� �Է°� ���ÿ� �����ڷ� �и����൵ �ȴ�.
class step_02_01_02 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" )); 
	}
}

//���׿����� ���
class step_02_01_03 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));

	}
}
