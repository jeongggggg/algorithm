package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 	27866. ���ڿ� ���ڿ� 
 	�ܾ� S�� ���� i�� �־����� ��, S�� i��° ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 	
 	ù° �ٿ� ���� �ҹ��ڿ� �빮�ڷθ� �̷���� �ܾ� S�� �־�����. 
 	�ܾ��� ���̴� �ִ� 1,000�̴�. ��° �ٿ� ���� i�� �־�����
*/

public class step_05_01 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		int n = sc.nextInt()-1;
		
		System.out.println(st.charAt(n));
		
		sc.close();
	}

}

class step_05_01_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		int n = Integer.parseInt(br.readLine())-1;
		
		br.close();
		
		System.out.println(st.charAt(n));
	}
}
