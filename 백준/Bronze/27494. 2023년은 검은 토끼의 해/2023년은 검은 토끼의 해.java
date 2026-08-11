import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            if (s.length() >= 4 && make(s)) cnt++;
        }
        System.out.println(cnt);
	}

	private static boolean make(String s) {
    
		ArrayList<Integer> digits = new ArrayList<Integer>();
        for (char c : s.toCharArray())
            if (Character.isDigit(c)) 
                digits.add(c - '0');
        
        if (digits.size() < 4) 
            return false;
        
        int n = digits.size();
        
        for (int i = 0; i < n - 3; i++) 
            if (digits.get(i) == 2) 
                for (int j = i + 1; j < n - 2; j++) 
                    if (digits.get(j) == 0) 
                        for (int k = j + 1; k < n - 1; k++) 
                            if (digits.get(k) == 2)
                                for (int l = k + 1; l < n; l++) 
                                    if (digits.get(l) == 3) 
                                        return true;
        return false;
    }
}
