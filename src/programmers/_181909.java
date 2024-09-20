package programmers;

import java.util.Arrays;

// 접미사 배열
public class _181909 {
    static class Solution {
        public String[] solution(String my_string) {
            String[] answer = new String[my_string.length()];

            for(int i = 0; i < answer.length; i++){
                answer[i] = my_string.substring(i);
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}
