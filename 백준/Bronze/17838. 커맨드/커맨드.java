import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String command = br.readLine();
			
			String A = command.charAt(0)+"";
			String B = "";
			for(int j = 1; j < command.length(); j++) {
				if(!((command.charAt(j)+"").equals(A))) {
					B = command.charAt(j)+"";
					command = command.replaceAll(A, "a");
					command = command.replaceAll(B, "b");
					break;
				}
			}
			
			if(command.equals("aabbabb")) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
    }
}
