package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
	10988. �Ӹ�������� Ȯ���ϱ�
	���ĺ� �ҹ��ڷθ� �̷���� �ܾ �־�����. �̶�, �� �ܾ �Ӹ�������� �ƴ��� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	�Ӹ�����̶� ������ ���� ���� �Ųٷ� ���� �� �Ȱ��� �ܾ ���Ѵ�. 
	level, noon�� �Ӹ�����̰�, baekjoon, online, judge�� �Ӹ������ �ƴϴ�.
	
	ù° �ٿ� �ܾ �־�����.
	�ܾ��� ���̴� 1���� ũ�ų� ����, 100���� �۰ų� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
	
	ù° �ٿ� �Ӹ�����̸� 1, �ƴϸ� 0�� ����Ѵ�.

*/


// Scanner�� �̿��Ͽ� ���ڿ��� �Է¹��� ��, ���ڿ� ������ ���ݸ�ŭ for���� �ݺ�
// charAt()�� �̿��Ͽ� �ܾ char������ �ٲٴµ� �ܾ ���� ��ġ�ؾ� �ϹǷ�
// str.charAt(i)�� str.charAt(len-1-i)�� �ٸ���� ans = 0�� �ǰ� ����
public class step_06_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		int len = str.length();
		int ans = 1;
		
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-1-i)) {
				ans = 0;
			}
		}
		System.out.println(ans);

	}

}

//StringBuilder�� reverse()�� ���
// �Ӹ������ ������ �о �ڷ� �о �����ϹǷ� ������ ���� ��� 
// str.charAt(i)�� �ڷ� ���� ��� sb.charAt(i)�� �ٸ� ��� ans = 0���� �����ϰ� ����

class step_06_04_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		int len = str.length();
		int ans = 1;
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i) != sb.charAt(i)) {
				ans = 0;
			}
		}
		System.out.println(ans);
		

	}

}

class step_06_04_02 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int ans = 1;
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
 
            if (c != input.charAt(input.length() - i - 1)) {
                ans = 0;
                break;
            }
        }
 
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
