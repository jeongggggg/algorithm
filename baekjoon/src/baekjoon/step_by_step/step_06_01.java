package baekjoon.step_by_step;

/*
 	25083. 새싹
*/

public class step_06_01 {

	public static void main(String[] args) {
		String s = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
				   "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
				   " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
				   "   `~\\/\n" + 			// \\, \n 이 제어문자다.
				   "      |\n" + 			// \n 이 제어문자다.
				   "      |";
 
		System.out.print(s);
	}
}
