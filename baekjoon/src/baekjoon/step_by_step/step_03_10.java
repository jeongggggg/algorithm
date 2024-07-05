package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/*
	2439. �����-2
	ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
	������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
	ù° �ٿ� N(1 �� N �� 100)�� �־�����.
	ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
*/

public class step_03_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

class step_03_10_01 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class step_03_10_02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				bw.write(' ');
			}
			for (int k = 1; k <= i; k++) {
				bw.write('*');
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
