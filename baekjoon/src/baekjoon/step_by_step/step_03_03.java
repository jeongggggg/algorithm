package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	8393. ��
	�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
	�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
*/


public class step_03_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int a = in.nextInt();
		in.close();
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}

class step_03_03_01 {

	public static void main(String[] args) throws IOException {
	        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		br.close();
		int s = 0;
 
		for( int i = 1 ; i <= N ; i++ ) s+=i;
 
		System.out.println(s);
	}
}

class step_03_03_02 {

	public static void main(String[] args) throws IOException {
	        
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int s = 0;
        
		for( int i = 1 ; i <= N ; i++ ) s+=i;
 
		System.out.println(s);
	}
}
