package baekjoon.step_by_step;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;


/*
	10926. ??!
	���ϴ� ����Ʈ�� ȸ�������� �ϴٰ� joonas��� ���̵� �̹� �����ϴ� ���� ���� �����. 
	���ϴ� ����� ??!�� ǥ���Ѵ�. ���ϰ� �����Ϸ��� �ϴ� ����Ʈ�� �̹� �����ϴ� ���̵� �־����� ��, 
	����� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/ 

public class step_01_07 {
	
	// Scanner ���
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String lastString = "??!";
		
		String s = in.next();
		System.out.println(s + lastString);
		
		in.close();
	}
	
	//BufferedReader ���
	/*
	 	public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String lastString = "??!";
			
			String s = br.readLine();
			System.out.println(s + lastString);
		}
	*/

}
