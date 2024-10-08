package baekjoon.step_by_step.step_12;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 	1018. 수학은 비대면강의입니다.
	수현이는 4차 산업혁명 시대에 살고 있는 중학생이다. 
	코로나 19로 인해, 수현이는 버추얼 학교로 버추얼 출석해 버추얼 강의를 듣고 있다. 
	수현이의 버추얼 선생님은 문자가 2개인 연립방정식을 해결하는 방법에 대해 강의하고, 다음과 같은 문제를 숙제로 냈다.

	다음 연립방정식에서 
	x와 y의 값을 계산하시오.
	 
	ax + by = c
	dx + ey = f
	
	4차 산업혁명 시대에 숙제나 하고 앉아있는 것보다 버추얼 친구들을 만나러 가는 게 더 가치있는 일이라고 생각했던 수현이는 이런 연립방정식을 풀 시간이 없었다. 
	다행히도, 버추얼 강의의 숙제 제출은 인터넷 창의 빈 칸에 수들을 입력하는 식이다. 각 칸에는 
	-999 이상 999 이하의 정수만 입력할 수 있다. 수현이가 버추얼 친구들을 만나러 버추얼 세계로 떠날 수 있게 도와주자.
	
	정수 a, b, c, d, e, f 가 공백으로 구분되어 차례대로 주어진다. (-999 ≤ a,b,c,d,e,f ≤ 999) 
	
	문제에서 언급한 방정식을 만족하는 (x,y)가 유일하게 존재하고, 이 때 
	x와 y가 각각 -999이상 999 이하의 정수인 경우만 입력으로 주어짐이 보장된다.
*/

public class step_12_03 {


    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값을 공백 기준으로 분리하여 각각 변수에 저장
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        // x와 y 값을 구하기 위해 식을 변형
        int denominator = a * e - b * d;
        int x = (c * e - b * f) / denominator;
        int y = (a * f - c * d) / denominator;

        // 결과 출력
        System.out.println(x + " " + y);
    }

}
