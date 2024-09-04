package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
	10988. 팰린드롬인지 확인하기
	알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
	팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
	level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
	
	첫째 줄에 단어가 주어진다.
	단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
	
	첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.

*/


// Scanner를 이용하여 문자열로 입력받은 뒤, 문자열 길이의 절반만큼 for문을 반복
// charAt()을 이용하여 단어를 char형으로 바꾸는데 단어가 서로 일치해야 하므로
// str.charAt(i)와 str.charAt(len-1-i)가 다른경우 ans = 0이 되게 설정
public class step_06_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		int len = str.length();
		int ans = 1;
		
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-1-i)) {
				ans = 0;
			}
		}
		System.out.println(ans);

	}

}

//StringBuilder의 reverse()를 사용
// 팰린드롬은 앞으로 읽어도 뒤로 읽어도 동일하므로 앞으로 읽은 경우 
// str.charAt(i)와 뒤로 읽은 경우 sb.charAt(i)가 다른 경우 ans = 0으로 변경하게 설정

class step_06_04_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		int len = str.length();
		int ans = 1;
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i) != sb.charAt(i)) {
				ans = 0;
			}
		}
		System.out.println(ans);
		

	}

}

class step_06_04_02 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int ans = 1;
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
 
            if (c != input.charAt(input.length() - i - 1)) {
                ans = 0;
                break;
            }
        }
 
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}