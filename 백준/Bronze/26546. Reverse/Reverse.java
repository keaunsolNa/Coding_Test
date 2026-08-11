import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	String input = br.readLine();
        	String text = input.split(" ")[0];
        	int start = Integer.parseInt(input.split(" ")[1]);
        	int end = Integer.parseInt(input.split(" ")[2]);
        	
        	text = text.substring(0, start) + text.substring(end, text.length());
        	System.out.println(text);
        }
        
	}
}
