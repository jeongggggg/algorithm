package programmers;

// 홀짝에 따라 다른 값 반환하기
public class _181935 {
    public static void main(String[] args) {
        int n = 7;
        int answer = 0;

        if(n % 2 != 0){
            for(int i = 1; i <= n; i+=2){
                answer += i;
            }
        }else{
            for(int i = 2; i <= n; i+=2){
                answer += i * i;
            }
        }

        System.out.println(answer);
    }
}
