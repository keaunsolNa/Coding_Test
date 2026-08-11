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
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int cal = Integer.parseInt(br.readLine());
        N--;
        while(N -- > 0) {
        	int input = Integer.parseInt(br.readLine());
        	
        	if(cal < input) {
        		System.out.println("N");
        		return;
        	}
        }
        
        System.out.println("S");
        
	}
}
