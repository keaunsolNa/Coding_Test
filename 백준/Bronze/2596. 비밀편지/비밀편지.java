import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder answer = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int idx = 0;
		char[][] arr = new char[T][6];
		for(int i = 0; i < T; i++) {
			
			for(int j = 0; j < 6; j++) {
				arr[i][j] = input.charAt(idx++);
			}
		}
		
		idx = 1;
		String A = "000000";
		String B = "001111";
		String C = "010011";
		String D = "011100";
		String E = "100110";
		String F = "101001";
		String G = "110101";
		String H = "111010";
		
		for (char[] cs : arr) {
			
			StringBuilder temp = new StringBuilder();
			for(int i = 0; i < 6; i++) temp.append(cs[i]);
			
			
			if(check(temp.toString(), A)) answer.append("A");
			else if(check(temp.toString(), B)) answer.append("B");
			else if(check(temp.toString(), C)) answer.append("C");
			else if(check(temp.toString(), D)) answer.append("D");
			else if(check(temp.toString(), E)) answer.append("E");
			else if(check(temp.toString(), F)) answer.append("F");
			else if(check(temp.toString(), G)) answer.append("G");
			else if(check(temp.toString(), H)) answer.append("H");
			
			else {
				
				boolean flag = true;
				for(int i = 0; i < 6; i++) {
					
					temp.replace(i, i+1, temp.charAt(i) == '0' ? "1" : "0");
					
					if(check(temp.toString(), A)) { answer.append("A"); flag = false; break; }
					else if(check(temp.toString(), B)) { answer.append("B"); flag = false; break; }
					else if(check(temp.toString(), C)) { answer.append("C"); flag = false; break; }
					else if(check(temp.toString(), D)) { answer.append("D"); flag = false; break; }
					else if(check(temp.toString(), E)) { answer.append("E"); flag = false; break; }
					else if(check(temp.toString(), F)) { answer.append("F"); flag = false; break; }
					else if(check(temp.toString(), G)) { answer.append("G"); flag = false; break; }
					else if(check(temp.toString(), H)) { answer.append("H"); flag = false; break; }
					
					else temp.replace(i, i+1, temp.charAt(i) == '0' ? "1" : "0") ;
				}
				
				if(flag) { System.out.println(idx); System.exit(0); }
					
			}
			idx++;
		}
		
		System.out.println(answer);
	}

	private static boolean check(String target, String check) {
		
		return target.equals(check) ? true : false;
	}
}
