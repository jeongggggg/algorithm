package programmers.day_02;

// 문자열 겹쳐쓰기
public class _181943 {
    static class Solution {
        public String solution(String my_string, String overwrite_string, int s) {
            String answer = "";
            answer = my_string.substring(0, s) + overwrite_string;

            if(my_string.length() > answer.length()) {
                answer += my_string.substring(answer.length());
            }
            return answer;
        }
    }
}
