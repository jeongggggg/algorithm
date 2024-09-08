package baekjoon.step_by_step.step_13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/*
	10814.나이순 정렬
	온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
	첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
	둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 
	이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.
	
	조건에 따라 정렬하여 단어들을 출력한다.
	
	첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
*/

class Member {
    int age;
    String name;
    int order;

    // Member 클래스의 생성자, age, name, order를 초기화함
    Member(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }
}

public class step_13_10 {
	public static void main(String[] args) throws IOException {
        // BufferedReader를 사용해 입력을 빠르게 처리함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 회원 수를 입력받음
        int n = Integer.parseInt(br.readLine());
        
        // Member 객체를 담을 리스트 생성
        List<Member> members = new ArrayList<>();

        // n명의 회원 정보를 입력받아 리스트에 추가
        for (int i = 0; i < n; i++) {
            // 한 줄을 읽어와 StringTokenizer로 나이와 이름을 분리함
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken()); // 나이를 정수로 변환
            String name = st.nextToken();               // 이름을 문자열로 저장
            // Member 객체를 생성하여 리스트에 추가
            members.add(new Member(age, name, i));
        }

        // Collections.sort를 사용해 members 리스트를 정렬함
        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                // 나이가 다르면 나이순으로 정렬
                if (m1.age != m2.age) {
                    return m1.age - m2.age;
                } else {
                    // 나이가 같으면 가입 순서(order)로 정렬
                    return m1.order - m2.order;
                }
            }
        });

        // 정렬된 결과를 출력
        StringBuilder sb = new StringBuilder();
        for (Member member : members) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }
        System.out.print(sb.toString());

        br.close();
    }
}
