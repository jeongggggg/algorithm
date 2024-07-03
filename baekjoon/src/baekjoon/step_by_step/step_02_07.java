package baekjoon.step_by_step;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 	2480. �ֻ��� ����
 	1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�.
	���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�.
	���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�.
	��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.
	���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�. 
	�� 3���� ���� 2, 2, 2�� �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 
	3���� ���� 6, 2, 5�� �־����� ���� ���� ū ���� 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
	3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
	
	ù° �ٿ� 3���� ���� ��ĭ�� ���̿� �ΰ� ���� �־�����.
*/

public class step_02_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		in.close();
 
		// ���� ��� ������ �ٸ� ���
		if (a != b && b != c && a != c) {
			int max;
			// ���� a > b ���
			if (a > b) {
				// c > a > b ���
				if (c > a) {
					max = c;
				} 
				// a > (b, c)
				else {
					max = a;
				}
			}
			// b > a ���	
			else {
				// c > b > a ���
				if (c > b) {
					max = c;
				}
				// b > (a, c)
				else {
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		// ��� �� �� �̻��� ���� ���� ������ ������ ���
		else {
			// 3���� ������ ��� ���� ���
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			}
			else {
				// a�� bȤ�� c���� ���� ���
				if(a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				// b�� c�� ���� ���
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}

	}

}

class step_02_07_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int a, b, c;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
 
		// ���� ��� ������ �ٸ� ���
		if (a != b && b != c && a != c) {
			int max;
			// ���� a > b ���
			if (a > b) {
				// c > a > b ���
				if (c > a) {
					max = c;
				} 
				// a > (b, c)
				else {
					max = a;
				}
			}
			// b > a ���	
			else {
				// c > b > a ���
				if (c > b) {
					max = c;
				}
				// b > (a, c)
				else {
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		// ��� �� �� �̻��� ���� ���� ������ ������ ���
		else {
			// 3���� ������ ��� ���� ���
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			}
			else {
				// a�� bȤ�� c���� ���� ���
				if(a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				// b�� c�� ���� ���
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}

class step_02_07_02{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int a, b, c;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
 
		// ���� ��� ������ �ٸ� ���
		if (a != b && b != c && a != c) {
			int max = Math.max(a, Math.max(b, c));
			System.out.println(max * 100);
		}
		// 3���� ������ ��� ���� ���
		else if (a == b && a == c) {
			System.out.println(10000 + a * 1000);
		}
		// a�� bȤ�� c���� ���� ���
		else if(a == b || a == c) {
			System.out.println(1000 + a * 100);
		}
		// b�� c�� ���� ���
		else {
			System.out.println(1000 + b * 100);
		}
	}
}
	
