package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	2738. ��� ����
	N*Mũ���� �� ��� A�� B�� �־����� ��, �� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	ù° �ٿ� ����� ũ�� N �� M�� �־�����. 
	��° �ٺ��� N���� �ٿ� ��� A�� ���� M���� ���ʴ�� �־�����. 
	�̾ N���� �ٿ� ��� B�� ���� M���� ���ʴ�� �־�����. 
	N�� M�� 100���� �۰ų� ����, ����� ���Ҵ� ������ 100���� �۰ų� ���� �����̴�.
	ù° �ٺ��� N���� �ٿ� ��� A�� B�� ���� ����� ����Ѵ�. ����� �� ���Ҵ� �������� �����Ѵ�.
*/

public class step_07_01 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ����� ũ�� N�� M �Է�
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // ��� A�� B ���� �� �ʱ�ȭ
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // ��� A �Է�
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // ��� B �Է�
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // ��� A�� B�� ���� ����Ͽ� ���
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

class step_07_01_01 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        // ����� ũ�� N�� M �Է�
	        String[] dimensions = br.readLine().split(" ");
	        int N = Integer.parseInt(dimensions[0]);
	        int M = Integer.parseInt(dimensions[1]);

	        // ��� A�� B ���� �� �ʱ�ȭ
	        int[][] A = new int[N][M];
	        int[][] B = new int[N][M];

	        // ��� A �Է�
	        for (int i = 0; i < N; i++) {
	            String[] line = br.readLine().split(" ");
	            for (int j = 0; j < M; j++) {
	                A[i][j] = Integer.parseInt(line[j]);
	            }
	        }

	        // ��� B �Է�
	        for (int i = 0; i < N; i++) {
	            String[] line = br.readLine().split(" ");
	            for (int j = 0; j < M; j++) {
	                B[i][j] = Integer.parseInt(line[j]);
	            }
	        }

	        // ��� A�� B�� ���� ����Ͽ� ���
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < M; j++) {
	                sb.append(A[i][j] + B[i][j]).append(" ");
	            }
	            sb.append("\n");
	        }

	        System.out.print(sb.toString());
	    }
}