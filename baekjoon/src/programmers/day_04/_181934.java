package programmers.day_04;

// 조건 문자열
public class _181934 {
    public static void main(String[] args){
        int answer = 0;
        String ineq = ">";
        String eq = "=";
        int n = 50;
        int m = 20;
        String str1 = ineq + eq; // <=
        String str2 = ">="; // >=
        String str3 = "<=";
        String str4 = ">!";
        String str5 = "<!";

        if(str1.equals(str2)){
            if(n >= m){
                answer = 1;
            }
        }else if(str1.equals(str3)){
            if(n <= m){
                answer = 1;
            }
        }else if(str1.equals(str4)){
            if(n > m){
                answer = 1;
            }
        }else if(str1.equals(str5)){
            if(n < m){
                answer = 1;
            }
        }else{
            answer = 0;
        }
    }
}
