package baekjoon.step_by_step.step_01;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/*
	10926. ??!
	준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 
	준하는 놀람을 ??!로 표현한다. 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 
	놀람을 표현하는 프로그램을 작성하시오.
*/ 

// Scanner 사용
public class step_01_07 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String lastString = "??!";
		
		String s = in.next();
		System.out.println(s + lastString);
		
		in.close();
	}
}

//BufferedReader 사용
class step_01_07_01 {
	
 	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String lastString = "??!";
		
		String s = br.readLine();
		System.out.println(s + lastString);
	}
}