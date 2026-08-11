import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        
        for(int i = 0; i < N; i++) {
        	
        	char init = ' ';
        	switch(input.charAt(i)) {
        	
        		case '?' : init = input.charAt(N - i - 1) == '?' ? 'a' : input.charAt(N - i - 1); break;
        		default : init = input.charAt(i);
        		
        	}
        	
        	sb.append(init);
        }
        System.out.println(sb);
        
	}
}
