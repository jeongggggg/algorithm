package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
	25206. 너의 평점은
	인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 
	그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
	치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
	전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
	인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.
	
	A+	4.5
	A0	4.0
	B+	3.5
	B0	3.0
	C+	2.5
	C0	2.0
	D+	1.5
	D0	1.0
	F	0.0
	P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.
	과연 치훈이는 무사히 졸업할 수 있을까?
	
	20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
	치훈이의 전공평점을 출력한다.

	정답과의 절대오차 또는 상대오차가 10^-4 이하이면 정답으로 인정한다.
	
	[제한]
	1 ≤ 과목명의 길이 ≤ 50
	2.과목명은 알파벳 대소문자 또는 숫자로만 이루어져 있으며, 띄어쓰기 없이 주어진다. 입력으로 주어지는 모든 과목명은 서로 다르다.
	3.학점은 1.0,2.0,3.0,4.0중 하나이다.
	4.등급은 A+,A0,B+,B0,C+,C0,D+,D0,F,P중 하나이다.
	5.적어도 한 과목은 등급이 P가 아님이 보장된다.
*/

public class step_06_08 {

	 public static void main(String[] args) {
        // BufferedReader를 사용하여 입력을 읽음
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;  // 총 점수 합계를 저장할 변수
        double count = 0;  // 총 학점을 저장할 변수

        try {
            // 20개의 입력을 처리
            for (int i = 0; i < 20; i++) {
                // 한 줄의 입력을 읽어 공백으로 나눔
                String[] input = reader.readLine().split(" ");
                double val = Double.parseDouble(input[1]);  // 학점
                String grade = input[2];  // 성적
                count += val;  // 총 학점에 현재 학점을 더함

                // 성적에 따라 점수를 계산하여 총 점수에 더함
                switch (grade) {
                    case "A+":
                        sum += val * 4.5;
                        break;
                    case "A0":
                        sum += val * 4.0;
                        break;
                    case "B+":
                        sum += val * 3.5;
                        break;
                    case "B0":
                        sum += val * 3.0;
                        break;
                    case "C+":
                        sum += val * 2.5;
                        break;
                    case "C0":
                        sum += val * 2.0;
                        break;
                    case "D+":
                        sum += val * 1.5;
                        break;
                    case "D0":
                        sum += val * 1.0;
                        break;
                    case "F":
                        sum += val * 0;
                        break;
                    case "P":
                        count -= val;  // "P" (패스) 성적인 경우 총 학점에서 제외
                        break;
                }
            }

            // 평균 학점을 계산하여 출력
            System.out.println(sum / count);
        } catch (IOException e) {
            // 입출력 예외 처리
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // 숫자 형식 예외 처리
            e.printStackTrace();
        }
    }
}

// 학점과 대응하는 점수를 HashMap에 저장하여 switch 문을 간소화
class step_06_08_01 {

	 public static void main(String[] args) {
		  // BufferedReader를 사용하여 입력을 읽음
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        double sum = 0;  // 총 학점을 저장할 변수
	        double count = 0; // 총 과목 학점을 저장할 변수

	        // 학점 별 점수를 저장하는 맵 생성
	        Map<String, Double> gradeMap = new HashMap<>();
	        gradeMap.put("A+", 4.5);
	        gradeMap.put("A0", 4.0);
	        gradeMap.put("B+", 3.5);
	        gradeMap.put("B0", 3.0);
	        gradeMap.put("C+", 2.5);
	        gradeMap.put("C0", 2.0);
	        gradeMap.put("D+", 1.5);
	        gradeMap.put("D0", 1.0);
	        gradeMap.put("F", 0.0);

	        try {
	        	// 20개의 입력을 처리
	            for (int i = 0; i < 20; i++) {
	            	 // 한 줄의 입력을 읽어 공백으로 나눔
	                String[] input = reader.readLine().split(" ");
	                double val = Double.parseDouble(input[1]);  // 학점
	                String grade = input[2];  // 성적
	                
	                // "P" (패스) 학점이 아닌 경우에만 처리
	                if (!grade.equals("P")) {
	                    count += val; // 총 학점에 더함
	                    sum += val * gradeMap.getOrDefault(grade, 0.0); // 총 점수에 가중 학점을 더함
	                }
	            }
	            // 평균 학점을 계산하여 출력
	            System.out.println(sum / count);
	        } catch (IOException e) {
	        	// 입출력 예외 처리
	            e.printStackTrace();
	        } catch (NumberFormatException e) {
	        	// 숫자 형식 예외 처리
	            System.err.println("Invalid number format.");
	        }
	    }
}