package baekjoon.step_by_step;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

/*
	18108. 1998����� ���� �±������� 2541���?!
	ICPC Bangkok Regional�� �����ϱ� ���� ���ϳ�ǰ �������׿� �� ������ �� �������Ʈ ������ ���� ���� �� ������. 
	������ ���� ��ũ���� ���ذ� 2562���̶�� ���� �ִ� ���̾���.
	�ұ� ������ �±��� �Ҹ���(����Ѻ�), �� ������ϰ� ������ �ظ� �������� ������ ���� �ұ⸦ ����Ѵ�. 
	�ݸ�, �츮����� ���� ������ ����ϰ� �ִ�. 
	�ұ� ������ �־��� �� �̸� ���� ������ �ٲ� �ִ� ���α׷��� �ۼ��Ͻÿ�.
*/ 


public class step_01_08 {
	
	// Scanner ���
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		
		System.out.println(year - 543);
		
		in.close();
	}
	
	// BufferedReader ���
	/*
	 	public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String s = br.readLine();	// �� ���� �а� ���ڿ��� ��ȯ��
			int year = Integer.parseInt(s);	// ��ȯ �� ���ڿ��� ������ �ٲ���
			
			System.out.println(year - 543);
		}
	 */

}
