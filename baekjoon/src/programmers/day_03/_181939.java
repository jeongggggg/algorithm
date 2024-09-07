package programmers.day_03;

// 더 크게 합치기
public class _181939 {
    static class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            String str1 = Integer.toString(a);
            String str2 = Integer.toString(b);

            String ab = str1 + str2;
            String ba = str2 + str1;

            int a1 = Integer.parseInt(ab);
            int a2 = Integer.parseInt(ba);

            if(a1 > a2){
                answer = a1;
            }else if(ab.equals(ba)){
                answer = a1;
            }else{
                answer = a2;
            }

            return answer;
        }
    }
}
