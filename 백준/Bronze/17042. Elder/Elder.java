import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String owner = br.readLine();
        int T = Integer.parseInt(br.readLine());
        int cnt = 1;
        Set<String> ownerlist = new HashSet<>();
        ownerlist.add(owner);
        
        while(T --> 0) {
        	st = new StringTokenizer(br.readLine());
        	
        	String winner = st.nextToken();
        	String loswer = st.nextToken();
        	
        	if(loswer.equals(owner)) {
        		if(!ownerlist.contains(winner)) cnt++;
        		ownerlist.add(winner);
        		owner = winner;
        	}
        }
        
        System.out.println(owner);
        System.out.print(cnt);
	}
}
