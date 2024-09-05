package category.stack;

public class Sample {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        // my_string의 처음부터 s번째 인덱스까지 잘라서 답에 저장
        answer = my_string.substring(0, s) + overwrite_string;

        // 만약 my_string이 더 길다면, 남은 부분을 붙여줌
        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample sol = new Sample();

        // 예시 1
        String my_string = "hello world";
        String overwrite_string = "Java";
        int s = 6;
        String result = sol.solution(my_string, overwrite_string, s);
        System.out.println(result);  // 출력: hello Javad
    }
}
