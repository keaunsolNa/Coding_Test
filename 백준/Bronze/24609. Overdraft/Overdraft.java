import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int money = 0;
        int mini = 0;
        while(N --> 0) {
        	int input = Integer.parseInt(br.readLine());
        	
        	money += input;
        	
        	if(money < 0) 
        		mini = Math.max(mini, Math.abs(0 - money));
        }
        
        System.out.println(mini);
        
	}
}
