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
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			String F = st.nextToken();
			
			int K = Integer.parseInt(st.nextToken());
			
			try {
				
				Date date1 = sdf.parse(S);
				Date date2 = sdf.parse(F);
				
	    		long timeMil1 = date1.getTime();
	    		long timeMil2 = date2.getTime();

	    		long diff = timeMil2 - timeMil1;
	    		
	    		long diffSec = diff / 1000;
	    		
	    		if(diffSec <= 0) diffSec += 86400;
	    		K *= 60;
	    		
	    		if(diffSec >= K) System.out.println("Perfect");
	    		else if(diffSec + 3600 >= K) System.out.println("Test");
	    		else System.out.println("Fail");
	    		
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
	}
}
