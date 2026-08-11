import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        
        for(int i = 0; i < input.length; i++) {
        	if(!input[i].equals("bubble")) {
        		
        		if(!input[i].equals("tapioka")) {
        			sb.append(input[i] + " ");
        		}
        	}
        }
        
        if(sb.length() == 0) {
        	System.out.println("nothing");
        } else {
        	sb.deleteCharAt(sb.length() - 1);
        	System.out.print(sb);
        }
	}
}
