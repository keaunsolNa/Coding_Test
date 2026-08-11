import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test12();
	}

    public static void test12() throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	long A = Long.parseLong(st.nextToken());
    	long B = Long.parseLong(st.nextToken());
    	
    	long fiveAnswer = five(A) - five(A-B) - five(B);
    	long twoAnswer = two(A) - two(A-B) - two(B);
    	System.out.println(Math.min(fiveAnswer, twoAnswer));
    	
    }

    public static long five(long num) {
    	int count = 0;
    	
    	while(num >= 5) {
    		count += (num / 5);
    		num /= 5;
    	}
    	
    	return count;
    }

    public static long two(long num) {
    	int count = 0;
    	
    	while(num >= 2) {
    		count += (num / 2);
    		num /= 2;
    	}
    	
    	return count;
    }
}
