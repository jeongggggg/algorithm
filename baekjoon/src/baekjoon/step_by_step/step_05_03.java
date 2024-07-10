package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
	9086.���ڿ�  
	���ڿ��� �Է����� �ָ� ���ڿ��� ù ���ڿ� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T(1 �� T �� 10)�� �־�����. 
	�� �׽�Ʈ ���̽��� �� �ٿ� �ϳ��� ���ڿ��� �־�����. 
	���ڿ��� ���ĺ� A~Z �빮�ڷ� �̷������ ���ĺ� ���̿� ������ ������ ���ڿ��� ���̴� 1000���� �۴�.
	
	�� �׽�Ʈ ���̽��� ���ؼ� �־��� ���ڿ��� ù ���ڿ� ������ ���ڸ� �����Ͽ� ����Ѵ�.
*/

/*
���ڿ��� ���� �� �ִ� subString �Լ��� 2������ �ִµ�

 

1. String substring(int index) : String�� index��° ������ ������ �����´�.   

 ex)

    String str = "abcdefgh"
	str.substring(3) > defgh

 

2. String substring(int beginIndex, int endIndex) : String�� beginIndex��° ������ (endIndex-1)��° ������ �����´�.   
 
 ex)
 
    String str = "abcdefgh"
    str.substring(3,6) > def

 

�̸� �̿��ؼ� for�� �ȿ��� ���ڿ��� �Է¹޾Ҵ�.
�ѹ��� ����ϱ� ���� String �迭 name[]�� ������ ����,
ù��° ���ڸ� �������� ���� str.substring(0,1)
������ ���ڸ� �������� ���� str.substring(str.length()-1, str.length())�� �Ͽ���.
*/

public class step_05_03 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		String name[] = new String[n];
		
		for(int i=0;i<n;i++) {
			String str = sc.next();
			name[i] = str.substring(0,1)+ str.substring(str.length()-1,str.length());
		}
		
		sc.close();
		
		for(int i=0;i<n;i++) {
			System.out.println(name[i]);
		}	
	}
}

class step_05_03_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String name[] = new String[n];
		
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			name[i] = str.substring(0,1)+str.substring(str.length()-1,str.length());	
		}
		br.close();
		for(int i=0;i<n;i++) {
			System.out.println(name[i]);	
		}
	}
}
