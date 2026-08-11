import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        String base = br.readLine();

        int si = base.indexOf("*");

        String bs = base.substring(0, si);
        String be = base.substring(si + 1);

        int bsl = bs.length();
        int bel = be.length();

        int base_length = base.length() - 1;

        for(int i = 0; i < num; i++){
        	
            String temp = br.readLine();
            int tl = temp.length();

            if(tl < base_length) sb.append("NE" + "\n");
            
            else {
            	
                String ts = temp.substring(0, bsl);
                String te = temp.substring(tl - bel);

                if(ts.equals(bs) && te.equals(be)) sb.append("DA" + "\n");
                else sb.append("NE" + "\n");
            }


        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
        
	
	}
}
