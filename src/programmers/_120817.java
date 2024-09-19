package programmers;

// 배열의 평균값
public class _120817 {
    static class Solution {
        public double solution(int[] numbers) {
            double answer = 0;

            for(int i = 0; i < numbers.length; i++){
                answer += numbers[i];
            }

            answer = answer / numbers.length;

            return answer;
        }
    }
}
