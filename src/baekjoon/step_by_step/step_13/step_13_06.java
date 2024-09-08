package baekjoon.step_by_step.step_13;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/*
	1427. 소트인사이드
	배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
	첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
	첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
*/

public class step_13_06 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력된 숫자를 문자열로 받음
        String N = br.readLine();
        
        // 문자열을 문자 배열로 변환
        Character[] digits = new Character[N.length()];
        for (int i = 0; i < N.length(); i++) {
            digits[i] = N.charAt(i);
        }
        
        // 배열을 내림차순으로 정렬
        Arrays.sort(digits, Collections.reverseOrder());
        
        // 정렬된 배열을 다시 문자열로 변환
        StringBuilder sortedNumber = new StringBuilder();
        for (char digit : digits) {
            sortedNumber.append(digit);
        }

        System.out.println(sortedNumber.toString());
    }
}
