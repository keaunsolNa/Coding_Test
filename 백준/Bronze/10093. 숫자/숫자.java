import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
        if(B>A) {
            System.out.println(B -A -1);
            for(long i = A + 1; i < B; i++) System.out.print(i+" ");
        }
        else if(A > B) {
            System.out.println(A - B - 1);
            for(long i = B + 1; i < A; i++) System.out.print(i+" ");
        }
        else System.out.print(0);
	}
}
