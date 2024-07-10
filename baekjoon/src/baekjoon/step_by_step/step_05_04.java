package baekjoon.step_by_step;
import java.util.Scanner;
/*
	11654.�ƽ�Ű �ڵ� 
	���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, 
	�־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	���ĺ� �ҹ���, �빮��, ���� 0-9 �� �ϳ��� ù° �ٿ� �־�����.
	
	�Է����� �־��� ������ �ƽ�Ű �ڵ� ���� ����Ѵ�.
*/

/*
	Scanner ���� ���ڸ� �������� nextLine() �̳� next() �� ���� ���ڿ��� �Է¹޾Ƽ� charAt() ���� ���ڷ� �߶��־�� �Ѵ�.
	[�Է�] String ���� �Է¹޴´�.
	-> [charAt()] String ���� char ��, �� ���ڿ��� �߶� ���ڷ� ��ȯ�Ѵ�.
	-> int Ÿ�� ������ ���������ν� ���ڿ� �����Ǵ� ��, �� �ƽ�Ű �ڵ尪�� �����Ѵ�.
*/
public class step_05_04 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
 
		int ch = in.next().charAt(0);
		
		in.close();
        
		System.out.print(ch);
	}

}

/*
	Scanner �� ���� ����, ���� ���� �Է¹���� System.in �� ���� ���
	System.in �� byte ������ ���� �� ���� �����鼭 �ش� ���ڿ� �����Ǵ� �ƽ�Ű�ڵ� ���� ������ �� �ִ�.
	�ݵ�� �����ؾ� �� ���� ����ó���� ���־���Ѵ�.
	IOException (java.io ��Ű���� import �ؾ���) �� ���� ���� ���־ �ǰ�, 
	Exception ���� ó���ص� �ȴ�.
*/
class step_05_04_01 {

	public static void main(String[] args) throws Exception {
		 
		int a = System.in.read();
		System.out.print(a);
 
	}

}
