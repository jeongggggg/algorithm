package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/*
	11651.좌표 정렬하기2
	
	2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
	
	첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
	(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
	
	첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
*/

public class step_13_08 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[][] points = new int[N][2];
        
        // 점들의 좌표를 입력
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(input[0]); // x 좌표
            points[i][1] = Integer.parseInt(input[1]); // y 좌표
        }
        
        // Comparator를 사용하여 정렬
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                // y 좌표를 기준으로 오름차순 정렬
                if (p1[1] != p2[1]) {
                    return Integer.compare(p1[1], p2[1]);
                } 
                // y 좌표가 같다면 x 좌표를 기준으로 오름차순 정렬
                return Integer.compare(p1[0], p2[0]);
            }
        });
        
        // StringBuilder를 사용하여 결과를 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
