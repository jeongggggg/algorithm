package category.stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/*
	12605.단어순서 뒤집기
	
	문제
	스페이스로 띄어쓰기 된 단어들의 리스트가 주어질때, 단어들을 반대 순서로 뒤집어라. 
	각 라인은 w개의 영단어로 이루어져 있으며, 총 L개의 알파벳을 가진다. 
	각 행은 알파벳과 스페이스로만 이루어져 있다. 단어 사이에는 하나의 스페이스만 들어간다.
	
	입력
	첫 행은 N이며, 전체 케이스의 개수이다.

	N개의 케이스들이 이어지는데, 각 케이스는 스페이스로 띄어진 단어들이다. 
	스페이스는 라인의 처음과 끝에는 나타나지 않는다. N과 L은 다음 범위를 가진다.
	
	N = 5
	1 ≤ L ≤ 25
	
	출력
	각 케이스에 대해서, 케이스 번호가 x일때  "Case #x: " 를 출력한 후 그 후에 이어서 단어들을 반대 순서로 출력한다.
*/
public class _12605 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 수 N 입력 받기
        int N = Integer.parseInt(br.readLine());

        // N번의 테스트 케이스 처리
        for (int i = 1; i <= N; i++) {
            // 한 줄 입력 받기
            String line = br.readLine();

            // 입력받은 문자열을 공백을 기준으로 단어로 분리
            String[] words = line.split(" ");

            // 역순으로 단어를 저장할 StringBuilder 객체 생성
            StringBuilder reversed = new StringBuilder();

            // 단어를 역순으로 순회하며 StringBuilder에 추가
            for (int j = words.length - 1; j >= 0; j--) {
                reversed.append(words[j]);
                // 마지막 단어가 아니면 공백 추가
                if (j > 0) {
                    reversed.append(" ");
                }
            }

            // 케이스 번호와 함께 역순으로 정렬된 단어들 출력
            System.out.println("Case #" + i + ": " + reversed.toString());
        }

        br.close();
    }
}

class _12605_sc {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 수 N 입력 받기
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비

        // N번의 테스트 케이스 처리
        for (int i = 1; i <= N; i++) {
            // 한 줄 입력 받기
            String line = scanner.nextLine();

            // 입력받은 문자열을 공백을 기준으로 단어로 분리
            String[] words = line.split(" ");

            // 역순으로 단어를 저장할 StringBuilder 객체 생성
            StringBuilder reversed = new StringBuilder();

            // 단어를 역순으로 순회하며 StringBuilder에 추가
            for (int j = words.length - 1; j >= 0; j--) {
                reversed.append(words[j]);
                // 마지막 단어가 아니면 공백 추가
                if (j > 0) {
                    reversed.append(" ");
                }
            }

            // 케이스 번호와 함께 역순으로 정렬된 단어들 출력
            System.out.println("Case #" + i + ": " + reversed.toString());
        }

        scanner.close();
    }
}