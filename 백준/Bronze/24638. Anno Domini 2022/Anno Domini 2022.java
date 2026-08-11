import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] one = br.readLine().split(" ");
        String[] two = br.readLine().split(" ");
        
        int year1 = 0;
        String ADBC1 = "";
        int year2 = 0;
        String ADBC2 = "";
        
        try {
        	year1 = Integer.parseInt(one[0]);
        	ADBC1 = "BC";
        } catch(java.lang.NumberFormatException e) {
        	ADBC1 = "AD";
        	year1 = Integer.parseInt(one[1]);
        };

        try {
        	year2 = Integer.parseInt(two[0]);
        	ADBC2 = "BC";
        } catch(java.lang.NumberFormatException e) {
        	ADBC2 = "AD";
        	year2 = Integer.parseInt(two[1]);
        };
        
        if(ADBC1.equals("AD") && ADBC2.equals("AD")) {
        	System.out.println(Math.max(year1, year2) - Math.min(year1, year2));
        } else if(ADBC1.equals("AD") && ADBC2.equals("BC")) {
        	System.out.println(year1 + year2 - 1);
        } else if(ADBC1.equals("BC") && ADBC2.equals("AD")) {
        	System.out.println(year1 + year2 - 1);
        } else {
        	System.out.println(Math.max(year1, year2) - Math.min(year1, year2));
        }
        
	}
}
