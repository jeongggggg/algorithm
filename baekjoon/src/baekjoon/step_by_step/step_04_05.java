package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

/*
	10810. ���ֱ�
	���� : �����̴� �ٱ��ϸ� �� N�� ������ �ְ�, ������ �ٱ��Ͽ��� 1������ N������ ��ȣ�� �Ű��� �ִ�. ��, 1������ N������ ��ȣ�� �����ִ� ���� �ſ� ���� ������ �ִ�. 
	���� ó�� �ٱ��Ͽ��� ���� ������� ������, �ٱ��Ͽ��� ���� 1���� ���� �� �ִ�.
	�����̴� ������ M�� ���� �������� �Ѵ�. 
	�����̴� �� �� ���� ���� ��, ���� ���� �ٱ��� ������ ���ϰ�, 
	���� �ٱ��Ͽ� ��� ���� ��ȣ�� �����ִ� ���� �ִ´�. 
	����, �ٱ��Ͽ� ���� �̹� �ִ� ��쿡�� ����ִ� ���� ����, 
	���� ���� �ִ´�. ���� ���� �ٱ��ϴ� ���ӵǾ� �־�� �Ѵ�.
	���� ��� �������� �־����� ��, 
	M�� ���� ���� ���Ŀ� �� �ٱ��Ͽ� � ���� ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է� : ù° �ٿ� N (1 �� N �� 100)�� M (1 �� M �� 100)�� �־�����.
	��° �ٺ��� M���� �ٿ� ���ļ� ���� �ִ� ����� �־�����. 
	�� ����� �� ���� i j k�� �̷���� ������, i�� �ٱ��Ϻ��� j�� �ٱ��ϱ����� 
	k�� ��ȣ�� ������ �ִ� ���� �ִ´ٴ� ���̴�. 
	���� ���, 2 5 6�� 2�� �ٱ��Ϻ��� 5�� �ٱ��ϱ����� 6�� ���� �ִ´ٴ� ���̴�. (1 �� i �� j �� N, 1 �� k �� N)
	�����̴� �Է����� �־��� ������� ���� �ִ´�.
	
	��� : 1�� �ٱ��Ϻ��� N�� �ٱ��Ͽ� ����ִ� ���� ��ȣ�� �������� ������ ����Ѵ�. 
	���� ������� ���� �ٱ��ϴ� 0�� ����Ѵ�.
*/

public class step_04_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        for(int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

	}

}

class step_04_05_01 {

	public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer�� N�� M, " "(����)���� ����

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());			 // StringTokenizer�� " "(����)���� ����
														
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
