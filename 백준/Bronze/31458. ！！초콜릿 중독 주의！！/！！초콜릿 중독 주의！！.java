import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int t = Integer.parseInt(br.readLine());

    	while(t --> 0) {
    		
    		String str = br.readLine();

    		int len = str.length();
    		int idx = str.indexOf('0') == - 1 ? str.indexOf('1') : str.indexOf('0');
    		int fac = len - idx - 1;

    		int number = str.charAt(idx) - '0';
    		if(fac > 0) number = 1;
    		
    		idx %= 2;
    		number = idx == 1 ? (number == 1 ? 0 : 1) : number;
    		
    		sb.append(number).append("\n");
    	}

    	System.out.println(sb);
    }
}