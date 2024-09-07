package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	11718. 그대로 출력하기
	입력 받은 대로 출력하는 프로그램을 작성하시오.
	
	입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 
	알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 
	빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
*/

public class step_05_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.println(input);
        }
		
		// hasNextLine()은 boolean 형식으로 반환해주는 메소드
		// 다음 줄에 입력이 있는지의 여부를 판단하여 true / false를 반환
		// 개행문자(\n)도 동일하게 true로 반환하기 때문에 주의
		sc.close();
	}
}

class step_05_11_01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		
		//입력값이 null 일때까지 while문을 반복하여 출력
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}
}