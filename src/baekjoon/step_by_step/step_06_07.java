package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	1316. 그룹 단어 체커
	문제
	그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
	kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
	
	단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
	
	출력
	첫째 줄에 그룹 단어의 개수를 출력한다.
*/

public class step_06_07 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 0;  // 그룹 단어의 개수를 세기 위한 변수
        int N = Integer.parseInt(br.readLine());  // 단어의 개수 입력

        // N개의 단어를 검사
        for (int i = 0; i < N; i++) {
            if (isGroupWord(br.readLine())) {  // 그룹 단어인지 검사
                count++;
            }
        }

        System.out.print(count);  // 그룹 단어의 총 개수 출력
    }

    // 그룹 단어인지 확인하는 메소드
    public static boolean isGroupWord(String str) {
        boolean[] seen = new boolean[26];  // 각 알파벳의 등장 여부를 기록하는 배열
        char prev = '\0';  // 이전 문자 초기화

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);  // 현재 문자
            
            // 이전 문자와 현재 문자가 다르면
            if (prev != current) {
                // 현재 문자가 처음 등장한 경우
                if (!seen[current - 'a']) {
                    seen[current - 'a'] = true;  // 현재 문자를 등장한 것으로 기록
                    prev = current;  // 이전 문자를 현재 문자로 갱신
                } else {
                    // 이미 등장했던 문자가 연속되지 않은 경우 그룹 단어가 아님
                    return false;
                }
            }
        }
        
        return true;  // 모든 조건을 통과하면 그룹 단어
    }
}
