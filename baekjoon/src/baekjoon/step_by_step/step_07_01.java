package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	2738. 행렬 덧셈
	N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
	첫째 줄에 행렬의 크기 N 과 M이 주어진다. 
	둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 
	이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. 
	N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
	첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
*/

public class step_07_01 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 행렬의 크기 N과 M 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 행렬 A와 B 선언 및 초기화
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // 행렬 A 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // 행렬 B 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // 행렬 A와 B의 합을 계산하여 출력
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

	        // 행렬의 크기 N과 M 입력
	        String[] dimensions = br.readLine().split(" ");
	        int N = Integer.parseInt(dimensions[0]);
	        int M = Integer.parseInt(dimensions[1]);

	        // 행렬 A와 B 선언 및 초기화
	        int[][] A = new int[N][M];
	        int[][] B = new int[N][M];

	        // 행렬 A 입력
	        for (int i = 0; i < N; i++) {
	            String[] line = br.readLine().split(" ");
	            for (int j = 0; j < M; j++) {
	                A[i][j] = Integer.parseInt(line[j]);
	            }
	        }

	        // 행렬 B 입력
	        for (int i = 0; i < N; i++) {
	            String[] line = br.readLine().split(" ");
	            for (int j = 0; j < M; j++) {
	                B[i][j] = Integer.parseInt(line[j]);
	            }
	        }

	        // 행렬 A와 B의 합을 계산하여 출력
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