package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	10871. X���� ���� ��
	���� : ���� N���� �̷���� ���� A�� ���� X�� �־�����. 
	�̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է� : ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
	��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. 
	�־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
	
	��� : X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
*/

// �迭�� �Է¹��� ������ �� ������ �� �ٽ� �� �� �ݺ������� �迭�� �˻��Ͽ� ���ǹ��� ���� ���
public class step_04_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		int X = in.nextInt();
		int arr[] = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
 
		in.close();
        
		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}

// �迭 ��� X, �Է¹����� ���ÿ� if ������ �˻��ؼ� �־��� �� ���� ���� ��� StringBuilder �� �������ִ� ���
class step_04_02_01 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
        
		StringBuilder sb = new StringBuilder();
 
		for(int i = 0 ; i < N ; i++) {
			
			int value = in.nextInt();
			if(value < X) {
				sb.append(value+" ");
			}
		}
		
		in.close();
		System.out.println(sb);	
	}
}

// BufferedReader �� �Է¹޴¸�ŭ ���ڿ� �и��� ���־�� �ϱ� ������ StringTokenizer ���� �ʿ�
class step_04_02_02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
 
		StringBuilder sb = new StringBuilder();
 
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
 
			if (value < X)
				sb.append(value).append(' ');
		}
		System.out.println(sb);
	}
}
