package baekjoon.step_by_step.step_07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	10798.세로읽기  
	아직 글을 모르는 영석이가 벽에 걸린 칠판에 자석이 붙어있는 글자들을 붙이는 장난감을 가지고 놀고 있다. 
	이 장난감에 있는 글자들은 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’이다. 영석이는 칠판에 글자들을 수평으로 일렬로 붙여서 단어를 만든다. 다시 그 아래쪽에 글자들을 붙여서 또 다른 단어를 만든다. 이런 식으로 다섯 개의 단어를 만든다. 아래 그림 1은 영석이가 칠판에 붙여 만든 단어들의 예이다. 
	
	A A B C D D
	a f z z 
	0 9 1 2 1
	a 8 E W g 6
	P 5 h 3 k x
	
	한 줄의 단어는 글자들을 빈칸 없이 연속으로 나열해서 최대 15개의 글자들로 이루어진다. 또한 만들어진 다섯 개의 단어들의 글자 개수는 서로 다를 수 있다. 
	심심해진 영석이는 칠판에 만들어진 다섯 개의 단어를 세로로 읽으려 한다. 세로로 읽을 때, 각 단어의 첫 번째 글자들을 위에서 아래로 세로로 읽는다. 
	다음에 두 번째 글자들을 세로로 읽는다. 이런 식으로 왼쪽에서 오른쪽으로 한 자리씩 이동 하면서 동일한 자리의 글자들을 세로로 읽어 나간다. 
	위의 그림 1의 다섯 번째 자리를 보면 두 번째 줄의 다섯 번째 자리의 글자는 없다. 이런 경우처럼 세로로 읽을 때 해당 자리의 글자가 없으면, 읽지 않고 그 다음 글자를 계속 읽는다. 
	그림 1의 다섯 번째 자리를 세로로 읽으면 D1gk로 읽는다. 
	그림 1에서 영석이가 세로로 읽은 순서대로 글자들을 공백 없이 출력하면 다음과 같다:
	Aa0aPAf985Bz1EhCz2W3D1gkD6x
	칠판에 붙여진 단어들이 주어질 때, 영석이가 세로로 읽은 순서대로 글자들을 출력하는 프로그램을 작성하시오.
	
	총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다. 
	주어지는 글자는 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’ 중 하나이다. 각 줄의 시작과 마지막에 빈칸은 없다.
	
	영석이가 세로로 읽은 순서대로 글자들을 출력한다. 이때, 글자들을 공백 없이 연속해서 출력한다. 

*/

// 1. 세로 5 가로 15줄이 주어진다. == 2차원 배열을 선언한다.
// 2. 각 줄마다 문자열을 입력받고 최대 길이를 max 변수에 저장한다.
// 3. 입력받은 문자열을 char 2차원 배열에 담는다.
// 4. 세로로 읽으므로 열과 행으로 출력하고, 값이 '\0'인 경우 넘어간다.
// ※char 배열의 초기 값은 '\0' 이다.

public class step_07_03 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] ch = new char[5][15];  // 5x15 크기의 문자 배열 선언
        int max = 0;  // 각 문자열의 최대 길이를 저장할 변수

        // 5개의 문자열 입력을 받아 2차원 배열에 저장
        for (int i = 0; i < ch.length; i++) {
            String str = br.readLine();  // 한 줄 입력 받기
            if (max < str.length()) {
                max = str.length();  // 가장 긴 문자열의 길이를 갱신
            }

            // 입력 받은 문자열을 문자 배열에 저장
            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();  // 결과 문자열을 저장할 StringBuilder 객체
        // 세로로 읽으면서 문자열을 조합
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (ch[j][i] == '\0') {
                    continue;  // 현재 위치에 문자가 없으면 건너뜀
                }
                sb.append(ch[j][i]);  // 문자 추가
            }
        }
        System.out.println(sb);  // 최종 결과 출력
    }

}