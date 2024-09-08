package baekjoon.step_by_step.step_01;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	1000. A+B
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/ 


// Scanner 사용시
public class step_01_02 {
	
	public static void main(String[] args) {
	   	Scanner scan = new Scanner(System.in);
	       
       int a = scan.nextInt();
       int b = scan.nextInt();
       
       System.out.println(a + b);
       
       scan.close(); //new Scanner 를 System.in을 해주었기 때문에 반드시 close 를 해주어야한다      
	}
}

//BufferedReader 사용시
class step_01_02_01 {
	
	 public static void main(String[] args) throws IOException{
	       
	    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	       
	    int a = Integer.parseInt(buf.readLine());
	    int b = Integer.parseInt(buf.readLine());
	       
	    System.out.println(a + b);
	}
}