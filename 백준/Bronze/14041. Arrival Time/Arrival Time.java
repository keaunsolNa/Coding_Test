import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		int HH = Integer.parseInt(st.nextToken());
		int MM = Integer.parseInt(st.nextToken());
		
		int time = HH * 60 + MM;
		
	    for (int i = 0; i < 120; i++) {
	    	
	    	if ((time >= 420 && time < 600) || (time >= 900 && time < 1140)) time += 2;
	    	else time++;
	    	
	    	time %= 1440;
	    	
	    }
	    
	    String H = (time / 60 < 10) ? "0" + (time / 60) : (time / 60) + "";
	    String M = (time % 60 < 10) ? "0" + (time % 60) : (time % 60) + "";
	    System.out.println(H + ":" + M);
	}
}
