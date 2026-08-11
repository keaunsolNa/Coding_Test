import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input = "";
        
        while(!(input = br.readLine()).equals("0 0")) {
        	st = new StringTokenizer(input);
        	
        	int time = Integer.parseInt(st.nextToken());
        	int bite = Integer.parseInt(st.nextToken());
        	
        	sb.append(Math.min((time * 30) + (bite * 40), Math.min((time * 35) + (bite * 30), (time * 40) + (bite * 20)))).append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
}
