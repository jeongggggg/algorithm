package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	1157. �ܾ� ����
	���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
	��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
	ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
	ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�.
	��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
*/


// ���ڵ��� �󵵼��� ��Ÿ���� ���� �迭�� �ϳ� �����ϰ� ���ڿ� s �� �Է¹޴´�. �̶� �迭�� 0 ��° ���Ҵ� A �� �ǹ�
// ���ڿ� s �� ���Ͽ� ù ��° ���ں��� ������ ���ڱ��� �˻��ϱ� ���� �ݺ����� �ۼ�
// �ݺ����� ���鼭 �ش� ���ڰ� � ���ڳĿ� ���� �ش� �迭 ���Ҹ� ����
// �迭�� ���ҵ��� ���� ���Ͽ� ���� ū ���� �����ִ� �ε����� ���ڸ� ���
// �迭���� ��ȸ�ϱ� ���� �ݺ����� �ۼ�
// �迭 ���� ���� max ���� Ŭ ���� �ش� ���Ұ����� max �� ��ġ���ְ�, ch �� ���ڸ� �ش� �ε����� �����ϴ� ���ڷ� ��ġ
public class step_06_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int[] arr = new int[26]; // �������� ������ 26����
		String s = in.next();
 
		for (int i = 0; i < s.length(); i++){
 
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // �빮�� ����
				arr[s.charAt(i) - 'A']++;	// �ش� �ε����� �� 1 ����
			}
    
			else {	// �ҹ��� ����
				arr[s.charAt(i) - 'a']++;
			}
		}
 
 
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // �빮�ڷ� ����ؾ��ϹǷ� 65�� �����ش�.
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		in.close();
		System.out.print(ch);

	}

}

class step_06_05_01 {

	public static void main(String[] args) throws IOException{
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // �������� ������ 26����
		String s = br.readLine();
		
 
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				arr[s.charAt(i) - 97]++;
			} else {
				arr[s.charAt(i) - 65]++;
			}
		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} 
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}

}

//  ���ڿ� ������ ������ ���� �Է°� ���ÿ� byte ������ ��ȯ�Ͽ� �迭�� ���Ҹ� ������Ű�� ���
// �迭�� ��ȸ�Ͽ� max ���� ã���鼭 ���ڸ� ������ �� �־��� ��� ĳ������ 26�� ���־���ϹǷ� �ϴ� int ������ ������ �� ������ ��¿����� ĳ����
class step_06_05_02 {

	public static void main(String[] args) throws IOException {
		 
		int[] arr = new int[26]; // �������� ������ 26����
 
		int c = System.in.read();
 
		while (c > 64) {	// ������ �Է¹޴� ���� ����� 
			
			if (c < 91) {
				arr[c - 65]++;
			} else {
				arr[c - 97]++;
			}
			c = System.in.read();
		}
 
 
		int max = -1;
		int ch = -2;	// ? �� 63 �̴�.
 
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				ch = i;
			} else if (arr[i] == max) {
				ch = -2;
			}
		}
		System.out.print((char) (ch+65));
	}

}

// �˰��� ���� : https://st-lab.tistory.com/64