package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	2743.�ܾ� ���� ��� 
	���ĺ����θ� �̷���� �ܾ �Է¹޾�, �� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	ù° �ٿ� ���� �ҹ��ڿ� �빮�ڷθ� �̷���� �ܾ �־�����. �ܾ��� ���̴� �ִ� 100�̴�.

	ù° �ٿ� �Է����� �־��� �ܾ��� ���̸� ����Ѵ�.
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
