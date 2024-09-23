package programmers;

// [PCCE 기출문제] 6번 / 물 부족
public class PCCE_340202 {
    static class Solution {
        public int solution(int storage, int usage, int[] change) {
            int total_usage = 0;
            for(int i=0; i<change.length; i++){
                usage = usage + usage * change[i] / 100;
                total_usage += usage;
                if(total_usage > storage){
                    return i;
                }
            }
            return -1;
        }
    }
}
