package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	1001. A-B
	두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
*/ 

// Scanner 사용시
public class step_01_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println(a - b);
        
        scan.close();
	}
}

//BufferedReader 사용시
class step_01_03_01 {
	
	 public static void main(String[] args) throws IOException{
	       
	      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	        
	      int a = Integer.parseInt(buf.readLine());
	      int b = Integer.parseInt(buf.readLine());
	        
	      System.out.println(a - b);
	}
}

