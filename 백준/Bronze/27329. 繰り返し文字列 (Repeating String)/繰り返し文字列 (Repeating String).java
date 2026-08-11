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
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		
		int start = 0;
		int last = input.length();
		int mid = 0;
		
		if(T % 2 == 0) mid = (start + last) / 2;
		else mid = (start + last) / 2;
		
			
		if(input.substring(start, mid).equals(input.substring(last - mid, last))) {
			System.out.println("Yes");
			return;
		}
	
		System.out.println("No");
	}
}
