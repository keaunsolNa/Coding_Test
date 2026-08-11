import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while(!(input = br.readLine()).equals("#")) {
        	String[] inputArr = input.split(" ");
        	for(int i = 0; i < inputArr.length; i++) {
        		sb.append(new StringBuilder(inputArr[i]).reverse()).append(" ");
        	}
        	
        	sb.deleteCharAt(sb.length() - 1);
        	sb.append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
        
	}
}
