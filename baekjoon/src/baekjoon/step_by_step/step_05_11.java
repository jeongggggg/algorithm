package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	11718. �״�� ����ϱ�
	�Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, 
	���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. �� ���� 100���ڸ� ���� ������, 
	�� ���� �־����� �ʴ´�. ��, �� ���� �������� �������� �ʰ�, �������� ������ �ʴ´�.
*/

public class step_05_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.println(input);
        }
		
		// hasNextLine()�� boolean �������� ��ȯ���ִ� �޼ҵ�
		// ���� �ٿ� �Է��� �ִ����� ���θ� �Ǵ��Ͽ� true / false�� ��ȯ
		// ���๮��(\n)�� �����ϰ� true�� ��ȯ�ϱ� ������ ����
		sc.close();
	}
}

class step_05_11_01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		
		//�Է°��� null �϶����� while���� �ݺ��Ͽ� ���
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}
}
