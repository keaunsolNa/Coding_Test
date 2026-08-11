import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int cnt = 0;
        while((input = br.readLine()) != null) {
        	cnt += (input.length() - input.replaceAll("joke", "").length())/4;
        }
        
        System.out.println(cnt);
	}
}
