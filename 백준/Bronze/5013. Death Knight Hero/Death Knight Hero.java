import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i = 0; i < T; i++) {
			String skill = br.readLine();
			boolean flag = true;
			for(int j = 0; j < skill.length(); j++) {
				
				if(j != skill.length()-1) {
					if(skill.charAt(j) == 'C' && skill.charAt(j+1) == 'D') flag = false;
				}
			}
			
			if(flag) cnt++;
		}
		
		System.out.println(cnt);
	}
}
