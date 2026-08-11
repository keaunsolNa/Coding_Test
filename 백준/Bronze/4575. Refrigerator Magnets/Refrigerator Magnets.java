import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while(!(input = br.readLine()).equals("END")) {
        	boolean flag = true;
        	for(int i = 65; i <= 90; i++) {
        		if(countChar(input, (char)i) > 1) {
        			flag = false;
        			break;
        		}
        	}
        	
        	if(flag) sb.append(input).append("\n");
        	
        }
        
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
	}

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
