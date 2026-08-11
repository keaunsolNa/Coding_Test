import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String[] input = br.readLine().split(":");
		
		int M = Integer.parseInt(input[0]);
		int S = Integer.parseInt(input[1]);
		
		int S1 = (M * 3600) + (S * 60);
		int S2 = S + (M * 60);
		
		int T = S1 - S2;
		
		int min = T / 60;
		int hour = min / 60;
		int sec = T  % 60;
		min = min % 60;
		
		String ans = "";
		if(hour < 10) ans += ("0" + hour);
		else ans += hour + "";
		
		if(min < 10) ans += (":0" + min);
		else ans += ":" + min;
		
		if(sec < 10) ans += (":0" + sec);
		else ans += ":" + sec;
		
		System.out.println(ans);
	}
}
