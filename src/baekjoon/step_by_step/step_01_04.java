package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	10998. A×B
	두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
*/ 


//Scanner 사용
public class step_01_04 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int a, b;
	        a = scanner.nextInt();
	        b = scanner.nextInt();
	        
	        scanner.close();

	        int result = a * b;

	        System.out.println(result);
	    }
}

//BufferedReader 사용
class step_01_04_01 {
	
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A * B);
	}
}