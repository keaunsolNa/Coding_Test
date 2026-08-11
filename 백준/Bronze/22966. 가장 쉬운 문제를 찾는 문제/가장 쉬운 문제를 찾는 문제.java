import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
     
        int minL = Integer.MAX_VALUE;
        String answer = "";
        for(int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	String qs = st.nextToken();
        	int level = Integer.parseInt(st.nextToken());
        	if(level < minL) {
        		minL = level;
        		answer = qs;
        	}
        }
        
        System.out.println(answer);
        
	}
}
