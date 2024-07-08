package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

/*
	10813.���ٲٱ�
	�����̴� �ٱ��ϸ� �� N�� ������ �ְ�, ������ �ٱ��Ͽ��� 1������ N������ ��ȣ�� �Ű��� �ִ�. 
	�ٱ��Ͽ��� ���� 1���� ����ְ�, ó������ �ٱ��Ͽ� �����ִ� ��ȣ�� ���� ��ȣ�� ���� ���� ����ִ�.
	�����̴� ������ M�� ���� �ٲٷ��� �Ѵ�. 
	�����̴� ���� �ٲ� �ٱ��� 2���� �����ϰ�, �� �ٱ��Ͽ� ����ִ� ���� ���� ��ȯ�Ѵ�.
	���� ��� �ٲ����� �־����� ��, 
	M�� ���� �ٲ� ���Ŀ� �� �ٱ��Ͽ� � ���� ����ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է� : ù° �ٿ� N (1 �� N �� 100)�� M (1 �� M �� 100)�� �־�����.
	��° �ٺ��� M���� �ٿ� ���ļ� ���� ��ȯ�� ����� �־�����. 
	�� ����� �� ���� i j�� �̷���� ������, 
	i�� �ٱ��Ͽ� j�� �ٱ��Ͽ� ����ִ� ���� ��ȯ�Ѵٴ� ���̴�. (1 �� i �� j �� N)
	�����̴� �Է����� �־��� ������� ���� ��ȯ�Ѵ�.
	
	��� : 1�� �ٱ��Ϻ��� N�� �ٱ��Ͽ� ����ִ� ���� ��ȣ�� �������� ������ ����Ѵ�.
*/

/*
	1. ù° �ٿ� N�� M �� �־�����. 
	2. ��° �ٺ��� M���� �ٿ� ���ļ� ���� ��ȯ�� ����� �־���, i, j �� �Է¹���
	3. i �� �ٱ��Ͽ� j �� �ٱ��Ͽ� ����ִ� ���� ���� ��ȯ�Ѵ�.
	4. �ΰ��� ���� ���� ������ �迭�� ��� �ִ� ������ ��ȯ��Ų��.
*/
public class step_04_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.close();

        int N = sc.nextInt();
        int arr[] = new int[N];
        int M = sc.nextInt();
        int temp;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;                     // �迭�� index �� 0 ���� ���� [0,1,2,3,4,5]
        }                                       // ù��°�� 0 ������ ù��° �ٱ��� �̱⶧���� 1���� �����̴� +1 ����
        for(int j = 0; j < M; j++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }
        for(int k = 0; k <arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

	}
}

class step_04_06_01 {

	 public static void main(String[] args) throws IOException{

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int N = Integer.parseInt(st.nextToken());
	        int arr[] = new int[N];
	        int M = Integer.parseInt(st.nextToken());
	        int temp;

	        for(int i = 0; i < arr.length; i++) {
	            arr[i] = i + 1;                     // �迭�� index �� 0 ���� ���� [0,1,2,3,4,5]
	        }                                       // ù��°�� 0 ������ ù��° �ٱ��� �̱⶧���� 1���� �����̴� +1 ����
	        for(int j = 0; j < M; j++) {
	            st = new StringTokenizer(br.readLine());

	            int I = Integer.parseInt(st.nextToken());
	            int J = Integer.parseInt(st.nextToken());

	            temp = arr[I-1];
	            arr[I-1] = arr[J-1];
	            arr[J-1] = temp;
	        }
	        for(int k = 0; k <arr.length; k++) {
	            bw.write(arr[k] + " ");
	        }
	        br.close();
	        bw.flush();
	        bw.close();
	 }
}