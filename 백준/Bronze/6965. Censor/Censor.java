import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
        	String[] input = br.readLine().split(" ");
        	
        	for(int j = 0; j < input.length; j++) {
        		if(input[j].length() != 4) sb.append(input[j] + " ");
        		else sb.append("**** ");
        	}
        	
        	sb.deleteCharAt(sb.length() - 1);
        	sb.append("\n");
        	sb.append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
}
