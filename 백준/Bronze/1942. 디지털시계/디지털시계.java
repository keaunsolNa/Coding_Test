import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 3; i++) {
			
			String[] t = br.readLine().split(" ");
			int[] st = stringToIntArray(t[0].split(":"));
			int[] et = stringToIntArray(t[1].split(":"));
			int sti = timeCounter(st, false);
			int eti = timeCounter(et, false);
			int count = 0;
			
			while (sti != eti) {

				if (sti % 3 == 0) count++;
				sti = timeCounter(st, true);
			}
			
			count += (eti % 3 == 0) ? 1 : 0;
			System.out.println(count);
			
		}
		
	}

	private static int[] stringToIntArray(String[] strArr) {
		
	    int[] intArr = new int[strArr.length];
	    for (int i = 0; i < strArr.length; i++) intArr[i] = Integer.parseInt(strArr[i]);
	    return intArr;
	    
	}

	private static int timeCounter(int[] tArr, boolean convert) {
		
	    if (convert) {
	    	
	    	tArr[2] += 1;
	        
	    	if (tArr[2] == 60) {
	            tArr[2] = 0;
	            tArr[1] += 1;
	        }
	        
	    	if (tArr[1] == 60) {
	            tArr[1] = 0;
	            tArr[0] += 1;
	    	}

	    	if (tArr[0] == 24) {
	            tArr[0] = 0;
	        }
	    	
	    }

	    StringBuilder sb = new StringBuilder();
	    for (int time : tArr) sb.append(time < 10 ? "0" + time : time);
	    
	    return Integer.parseInt(sb.toString());
	}
}
