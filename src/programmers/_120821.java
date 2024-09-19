package programmers;

// 배열 뒤집기
public class _120821 {
    static class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = {};
            int[] reverseArr = new int[num_list.length];

            for(int i = 0; i <= num_list.length - 1; i++) {
                reverseArr[i] = num_list[num_list.length - 1 - i];
            }
            return reverseArr;
        }
    }
}
