package programmers.day_03;

// 문자 리스트를 문자열로 변환하기
public class _181941 {
    static class Solution {
        public String solution(String[] arr) {
            StringBuilder answer = new StringBuilder();

            for (String str : arr) {
                answer.append(str);  // 각 배열 요소를 차례로 추가
            }

            return answer.toString();  // 최종 문자열 반환
        }
    }
}
