import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        String winner = "";
        
        for(int i = 0; i < N; i++) {
        	String name = br.readLine();
        	int money = Integer.parseInt(br.readLine());
        	
        	if(money > max) {
        		max = money;
        		winner = name;
        	}
        }
        
        System.out.println(winner);
	}
}
