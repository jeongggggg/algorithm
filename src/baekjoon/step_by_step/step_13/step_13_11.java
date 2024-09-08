package baekjoon.step_by_step.step_13;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashMap;

/*
	18870.좌표 압축
	문제
	수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
	Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다.
	X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
	
	입력
	첫째 줄에 N이 주어진다.
	둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.
	
	출력
	첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.
	
	제한
	1 ≤ N ≤ 1,000,000
	-109 ≤ Xi ≤ 109
*/

public class step_13_11 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 좌표 배열과 정렬용 배열
        int[] coords = new int[N];
        int[] sortedCoords = new int[N];
        
        // 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            coords[i] = Integer.parseInt(st.nextToken());
            sortedCoords[i] = coords[i];
        }
        
        // 좌표 배열 정렬
        Arrays.sort(sortedCoords);
        
        // 압축된 좌표를 저장할 HashMap
        HashMap<Integer, Integer> compressedMap = new HashMap<>();
        
        // 압축된 값 매핑 (중복 제거)
        int rank = 0;
        for (int i = 0; i < N; i++) {
            if (!compressedMap.containsKey(sortedCoords[i])) {
                compressedMap.put(sortedCoords[i], rank);
                rank++;
            }
        }
        
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(compressedMap.get(coords[i])).append(" ");
        }
        
        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}
