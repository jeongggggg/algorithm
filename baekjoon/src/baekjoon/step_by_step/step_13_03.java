package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

/*
	25305. 커트라인
	2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 N명의 학생들이 응시했다.
	이들 중 점수가 가장 높은 k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.
	
	커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.
	
	첫째 줄에는 응시자의 수 N과 상을 받은 사람의 수 K가 공백을 사이에 두고 주어진다.
	둘째 줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어진다.
	
	상을 받는 커트라인을 출력하라.
*/

public class step_13_03 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 줄에서 N과 k를 입력 받음
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);
        
        // 두 번째 줄에서 점수 배열을 입력 받음
        String[] scoreLine = br.readLine().split(" ");
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(scoreLine[i]);
        }
        
        // 점수 배열을 내림차순으로 정렬
        Arrays.sort(scores);
        
        // k번째 점수를 커트라인으로 출력
        System.out.println(scores[N - k]);
    }
}
