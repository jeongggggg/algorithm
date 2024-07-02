package baekjoon.step_by_step;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	2884. �˶� �ð�
	���� : ����̴� ���� ��ħ �˶��� ��� �Ͼ��. 
	�˶��� ��� �ٷ� �Ͼ�� �����̰�����, �׻� ���ݸ� �� �ڷ��� ���� ������ ���� �б��� �����ϰ� �ִ�.
	����̴� ��� ����� �����غ�������, ���ݸ� �� �ڷ��� ������ �� � �͵� ���� ���� ������.
	�̷� ����̸� �ҽ��ϰ� ���� â���̴� �ڽ��� ����ϴ� ����� ��õ�� �־���.
	�ٷ� "45�� ���� �˶� �����ϱ�"�̴�.
	�� ����� �ܼ��ϴ�. ���� �����Ǿ� �ִ� �˶��� 45�� �ռ��� �ð����� �ٲٴ� ���̴�. 
	������ �˶� �Ҹ��� ������, �˶��� ���� ���� �� �� ���̱� �����̴�. 
	�� ����� ����ϸ�, ���� ��ħ �� ��ٴ� ����� ���� �� �ְ�, �б��� �������� �ʰ� �ȴ�.
	���� ����̰� ������ �˶� �ð��� �־����� ��, â������ ����� ����Ѵٸ�, �̸� ������ ���ľ� �ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է� : ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) 
	�׸��� �̰��� ���� ����̰� ������ �˶� �ð� H�� M���� �ǹ��Ѵ�.
	�Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 
	24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�. 
	�ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
	
	��� : ù° �ٿ� ����̰� â������ ����� ����� ��, �����ؾ� �ϴ� �˶� �ð��� ����Ѵ�. 
	(�Է°� ���� ���·� ����ϸ� �ȴ�.)

*/

public class step_02_05 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	
/*    
String ���� ���� ���ϰ� �Է°� ���ÿ� �����ڷ� �и����൵ �ȴ�.
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			H--;
			M= 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H+" "+(M-45));
		}
        
*/
	}
}
	




