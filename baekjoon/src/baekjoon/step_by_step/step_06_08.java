package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
	25206. ���� ������
	���ϴ��б� ��ǻ�Ͱ��а��� �����ϱ� ���ؼ���, ���������� 3.3 �̻��̰ų� ������縦 ����ؾ� �Ѵ�. 
	�׷��� �ƻԽ�, ġ���̴� �����ϰ� ������縦 �������� �ʾҴٴ� ����� ���޾Ҵ�!
	ġ������ ���������� ������ִ� ���α׷��� �ۼ��غ���.
	���������� �������� (���� �� ��������)�� ���� ������ �������� ���� ���̴�.
	���ϴ��б� ��ǻ�Ͱ��а��� ��޿� ���� ���������� ���� ǥ�� ����.
	
	A+	4.5
	A0	4.0
	B+	3.5
	B0	3.0
	C+	2.5
	C0	2.0
	D+	1.5
	D0	1.0
	F	0.0
	P/F ������ ��� ����� P�Ǵ� F�� ǥ�õǴµ�, ����� P�� ������ ��꿡�� �����ؾ� �Ѵ�.
	���� ġ���̴� ������ ������ �� ������?
	
	20�ٿ� ���� ġ���̰� ������ ���������� �����, ����, ����� �������� ���еǾ� �־�����.
	ġ������ ���������� ����Ѵ�.

	������� ������� �Ǵ� �������� 10^-4 �����̸� �������� �����Ѵ�.
	
	[����]
	1 �� ������� ���� �� 50
	2.������� ���ĺ� ��ҹ��� �Ǵ� ���ڷθ� �̷���� ������, ���� ���� �־�����. �Է����� �־����� ��� ������� ���� �ٸ���.
	3.������ 1.0,2.0,3.0,4.0�� �ϳ��̴�.
	4.����� A+,A0,B+,B0,C+,C0,D+,D0,F,P�� �ϳ��̴�.
	5.��� �� ������ ����� P�� �ƴ��� ����ȴ�.
*/

public class step_06_08 {

	 public static void main(String[] args) {
        // BufferedReader�� ����Ͽ� �Է��� ����
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;  // �� ���� �հ踦 ������ ����
        double count = 0;  // �� ������ ������ ����

        try {
            // 20���� �Է��� ó��
            for (int i = 0; i < 20; i++) {
                // �� ���� �Է��� �о� �������� ����
                String[] input = reader.readLine().split(" ");
                double val = Double.parseDouble(input[1]);  // ����
                String grade = input[2];  // ����
                count += val;  // �� ������ ���� ������ ����

                // ������ ���� ������ ����Ͽ� �� ������ ����
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
                        count -= val;  // "P" (�н�) ������ ��� �� �������� ����
                        break;
                }
            }

            // ��� ������ ����Ͽ� ���
            System.out.println(sum / count);
        } catch (IOException e) {
            // ����� ���� ó��
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // ���� ���� ���� ó��
            e.printStackTrace();
        }
    }
}

// ������ �����ϴ� ������ HashMap�� �����Ͽ� switch ���� ����ȭ
class step_06_08_01 {

	 public static void main(String[] args) {
		  // BufferedReader�� ����Ͽ� �Է��� ����
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        double sum = 0;  // �� ������ ������ ����
	        double count = 0; // �� ���� ������ ������ ����

	        // ���� �� ������ �����ϴ� �� ����
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
	        	// 20���� �Է��� ó��
	            for (int i = 0; i < 20; i++) {
	            	 // �� ���� �Է��� �о� �������� ����
	                String[] input = reader.readLine().split(" ");
	                double val = Double.parseDouble(input[1]);  // ����
	                String grade = input[2];  // ����
	                
	                // "P" (�н�) ������ �ƴ� ��쿡�� ó��
	                if (!grade.equals("P")) {
	                    count += val; // �� ������ ����
	                    sum += val * gradeMap.getOrDefault(grade, 0.0); // �� ������ ���� ������ ����
	                }
	            }
	            // ��� ������ ����Ͽ� ���
	            System.out.println(sum / count);
	        } catch (IOException e) {
	        	// ����� ���� ó��
	            e.printStackTrace();
	        } catch (NumberFormatException e) {
	        	// ���� ���� ���� ó��
	            System.err.println("Invalid number format.");
	        }
	    }
}