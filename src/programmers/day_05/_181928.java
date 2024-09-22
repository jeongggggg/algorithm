package programmers.day_05;

// 이어 붙인 수
public class _181928 {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";

        for(int num : num_list) {
            if(num % 2 == 0) {
                even += num + "";
            } else {
                odd += num + "";
            }
        }

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}

class _181929_2 {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]);
            } else {
                odd += Integer.toString(num_list[i]);
            }
        }

        answer = Integer.parseInt(even) + Integer.parseInt(odd);

        return answer;
    }
}
