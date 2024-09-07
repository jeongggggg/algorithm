package programmers;
import java.util.Scanner;

// 대소문자 바꿔서 출력하기
public class _181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";

        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);

            if(Character.isLowerCase(c)){
                b += Character.toUpperCase(c);

            }else{
                b += Character.toLowerCase(c);
            }
        }

        System.out.println(b);
    }
}
