package programmers.day_03;

// 두 수의 연산값 비교하기
public class _181938 {
    static class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            String str1 = Integer.toString(a);
            String str2 = Integer.toString(b);

            String ab = str1 + str2;

            int abInt = Integer.parseInt(ab);

            if(abInt < 2 * a * b){
                answer = 2 * a * b;
            }else{
                answer = abInt;
            }
            return answer;
        }
    }
}
