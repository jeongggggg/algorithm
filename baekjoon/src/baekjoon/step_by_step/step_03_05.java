package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	25314. �ڵ��� ü������ �Դϴ�
	���� : ������ ������ ���� ���̴�. 
	���� �غ� ������ �ؼ� �ռ� �������� �� ����� ���ƴ� ���� ���������� ĥ�ǿ� ���� �ڵ��ϴ� ������ �޾Ҵ�. 
	���ư� ���� ������ �� ���� ���ϴ� ��������. 
	C++ å�� ������ �о��� ���ƴ� ������ �� ���� ���ϴ� �ڵ带 ĥ�ǿ� ������. 
	�ڵ带 �� �������� ���� ������ �ߴ�. ������, ������� N����Ʈ ũ���� ������� ���α׷��� ��� �����ؾ� �ұ��?��
	���ƴ� å�� �ִ� ���� �ڷ����� ���õ� ������ ����� �´�. 
	å���� long int�� 4����Ʈ �������� ������ �� �ִ� ���� �ڷ����̰� 
	long long int�� 8����Ʈ �������� ������ �� �ִ� ���� �ڷ����̶�� ���� �־���. 
	���ƴ� �̷� ������ �����. 
	��int �տ� long�� �ϳ��� �� ���� ������ 4����Ʈ�� ������ �� �ִ� ������ �þ�� �ɱ�? 
	�и� long long long int�� 12����Ʈ, long long long long int�� 16����Ʈ���� ������ �� �ִ� ���� �ڷ����� �ž�!�� 
	�׷��� ���ƴ� ��Ȳ�ϴ� �������� ���� �ڷ��� ä ĥ�ǿ� ���� �ڷ����� �� �������� �����ߴ�.
	���ư� 
	$N$����Ʈ �������� ������ �� �ִٰ� �����ؼ� ĥ�ǿ� �� ���� �ڷ����� �̸��� �����ϱ�?

*/

public class step_03_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String str = "";
		scan.close();
		
		for(int i=1; i<=n/4; i++) {
			str += "long ";
		}
		System.out.println(str + "int");
	}

}

class step_03_05_01 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N / 4; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
	
}
