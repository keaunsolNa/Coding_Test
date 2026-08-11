import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			
			int T = Integer.parseInt(br.readLine());
			if(T == 0) break;
			List<String> str = new ArrayList<>();
			for(int i = 0; i < T; i++) str.add(br.readLine());
			boolean chk = false;
			int cnt = 0;
			
			while(true) {
				
				for(int i = 0; i < T; i++) {
					
					if(str.get(i).length() == 0) {
						chk = true;
						break;
					}
							
				}
	
				if(chk) break;
				
				for(int i = 0; i < T; i++) {
					
					for(int j = i + 1; j < T; j++) {
						
						if(str.get(i).equals(str.get(j))) {
							chk = true;
							break;
						}
					}
					if(chk) break;
				}
				
				if(chk) break;
				for(int i = 0; i < T; i++) str.set(i, str.get(i).substring(1, str.get(i).length()));
				cnt++;
			}
			
			System.out.println(cnt-1);
		}
	}
}
