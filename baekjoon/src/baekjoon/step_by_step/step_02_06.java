package baekjoon.step_by_step;


import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;

/*	2525. ����ð�
	 KOI ���ڿ����� �ǰ��� ���� ���ִ� ������������ �丮�� �����ϰ� ����� �ΰ����� ������ �����Ϸ��� �Ѵ�. �ΰ����� ������ ����ϴ� ����� ������ ���� ���� ���� ��Ḧ �ΰ����� ���쿡 ������ �ȴ�. �׷��� �ΰ����� ������ ���챸�̰� ������ �ð��� �� ������ �ڵ������� ����Ѵ�.
	����, KOI ������ �ΰ����� ���� �ո鿡�� ����ڿ��� ������������ �丮�� ������ �ð��� �˷� �ִ� ������ �ð谡 �ִ�.
	�����������̸� �����ϴ� �ð��� ���챸�̸� �ϴ� �� �ʿ��� �ð��� �д����� �־����� ��, ���챸�̰� ������ �ð��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	ù° �ٿ��� ���� �ð��� ���´�. ���� �ð��� �� A (0 �� A �� 23) �� �� B (0 �� B �� 59)�� ������ ��ĭ�� ���̿� �ΰ� ������� �־�����. �� ��° �ٿ��� �丮�ϴ� �� �ʿ��� �ð� C (0 �� C �� 1,000)�� �� ������ �־�����.
 */

	public class step_02_06 {

		 Scanner in = new Scanner(System.in);
		 
	     int A = in.nextInt();
	     int B = in.nextInt();
	
	     int C = in.nextInt();
	
	     int min = 60 * A + B;   // �� -> ��
	     min += C;
	
	     int hour = (min / 60) % 24;
	     int minute = min % 60;
	
	     System.out.println(hour + " " + minute);
	}

}
