package baekjoon.step_by_step;
import java.util.*;
import java.io.*;

/*
    1764. 듣보잡
    문제
    김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다.
    이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
    이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
    듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.

    출력
    듣보잡의 수와 그 명단을 사전순으로 출력한다.
*/
public class step_14_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 첫 줄에서 듣도 못한 사람의 수 N과 보도 못한 사람의 수 M을 받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 듣도 못한 사람 명단을 저장할 집합
        Set<String> unheard = new HashSet<>();

        // 듣도 못한 사람 입력 받기
        for (int i = 0; i < N; i++) {
            unheard.add(br.readLine());
        }

        // 듣보잡 명단을 저장할 리스트
        List<String> unheardUnseen = new ArrayList<>();

        // 보도 못한 사람 입력받으며 교집합 구하기
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (unheard.contains(name)) {
                unheardUnseen.add(name); // 교집합에 해당하는 이름 저장
            }
        }

        // 듣보잡 명단을 사전순으로 정렬
        Collections.sort(unheardUnseen);

        // 듣보잡의 수를 StringBuilder에 저장
        sb.append(unheardUnseen.size()).append("\n");

        // 사전순으로 정렬된 듣보잡 명단을 StringBuilder에 저장
        for (String name : unheardUnseen) {
            sb.append(name).append("\n");
        }

        // 결과를 출력
        System.out.print(sb.toString());
    }
}
