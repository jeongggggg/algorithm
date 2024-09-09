package programmers.day_15;

// 조건에 맞게 수열 변환하기 1
public class _181882 {
    static class Solution {
        public int[] solution(int[] arr) {
            int[] answer = new int[arr.length];

            for(int i = 0; i < answer.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    answer[i] = arr[i] / 2;
                }else if(arr[i] < 50 && arr[i] % 2 != 0){
                    answer[i] = arr[i] * 2;
                }else{
                    answer[i] = arr[i];
                }
            }
            return answer;
        }
    }
}
