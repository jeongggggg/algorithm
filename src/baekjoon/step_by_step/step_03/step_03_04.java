package baekjoon.step_by_step.step_03;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	25304. 영수증
	문제 : 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 
	그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 
	준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
	영수증에 적힌,
	- 구매한 각 물건의 가격과 개수
	- 구매한 물건들의 총 금액
	을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
	
	입력 : 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
	둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
	이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
*/

public class step_03_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // 영수증에 적힌 총 금액
        int N = sc.nextInt(); // 종류의 수
        int total = 0;
        
        sc.close();

        for(int i = 0; i < N; i++){
            int a = sc.nextInt(); // 각 물건의 가격
            int b = sc.nextInt(); // 각 물건의 개수
            total += a * b;
        }
        if(total == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

	}

}

class step_03_0_01 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int X = sc.nextInt(); // 영수증에 적힌 총 금액
			int N = sc.nextInt(); // 종류의 수
			int total = 0;

			for(int i = 0; i < N; i++){
			    int a = sc.nextInt(); // 각 물건의 가격
			    int b = sc.nextInt(); // 각 물건의 개수
			    total += a * b;
			}
			if(total == X){
			    System.out.println("Yes");
			}else{
			    System.out.println("No");
			}
		}

	}

}

class step_03_0_02 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sum += a * b;
        }
        if (sum == X)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

class step_03_0_03 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            sum += a * b;
        }
        if (sum == X)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}