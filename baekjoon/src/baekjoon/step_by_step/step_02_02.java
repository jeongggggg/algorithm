package baekjoon.step_by_step;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

/*
	9498. ���� ����
	���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
*/

public class step_02_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		in.close();
		
		if(A>=90) System.out.println("A");
		else if(A>=80) System.out.println("B");
		else if (A>=70) System.out.println("C");
		else if(A>=60) System.out.println("D");
		else System.out.println("F");
		
		/* ���׿����� ���
		 Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		in.close();
		
		System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
		*/
	}
	
	/*
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		int A = Integer.parseInt(br.readLine());
        
		if(A>=90) System.out.println("A");
		else if(A>=80) System.out.println("B");
		else if (A>=70) System.out.println("C");
		else if(A>=60) System.out.println("D");
		else System.out.println("F");
		
		// ���׿����� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
 		int A = Integer.parseInt(br.readLine());
        
		System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
	} 
	*/

}
