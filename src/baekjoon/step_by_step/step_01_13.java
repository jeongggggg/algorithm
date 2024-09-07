package baekjoon.step_by_step;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/*
	10172. 개
	아래 예제와 같이 개를 출력하시오.
	|\_/|
	|q p|   /}
	( 0 )"""\
	|"^"`    |
	||_/=\\__|
*/

public class step_01_13 {

	public static void main(String[] args) {
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");     
	}

}

class step_01_13_01 {
	public static void main(String[] args) {
		System.out.print(
        "|\\_/|\n" + 
		"|q p|   /}\n" + 
		"( 0 )\"\"\"\\\n" + 
		"|\"^\"`    |\n" + 
		"||_/=\\\\__|");
	}
}

class step_01_13_02 {
	public static void main(String[] args) {
			
		StringBuilder sb = new StringBuilder();
		 
		sb.append("|\\_/|\n");
		sb.append("|q p|   /}\n");
		sb.append("( 0 )\"\"\"\\\n");
		sb.append("|\"^\"`    |\n");    
		sb.append("||_/=\\\\__|\n"); 
        
		System.out.println(sb);
	}
}

class step_01_13_03 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 
		bw.write("|\\_/|");
		bw.newLine();	// 줄 구분자
        
		bw.write("|q p|   /}");
		bw.newLine();	
        
		bw.write("( 0 )\"\"\"\\");
		bw.newLine();	
        
		bw.write("|\"^\"`    |");
		bw.newLine();	
        
		bw.write("||_/=\\\\__|"); 
		        
		bw.flush();
		bw.close();
	}
}