import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        
        int[] oper = new int[50];
        oper['*'] = 1;
        oper['/'] = 1;
        oper['('] = -1;
        oper[')'] = -1;
        
        String s = br.readLine();
        
        for (int i = 0; i < s.length(); i++) {
        	
            char c = s.charAt(i);
            
            if (c >= 'A') {
                sb.append(c);
                continue;
            }
            
            if (c == '(') {
                stk.add(c);
                continue;
            }
            
            if (c == ')') {
            	
                while (stk.peek() != '(') sb.append(stk.pop());
                stk.pop();
                continue;
            }
            
            while (!stk.isEmpty() && oper[stk.peek()] >= oper[c]) sb.append(stk.pop());
            stk.add(c);
            
        }
        
        while (!stk.isEmpty()) sb.append(stk.pop());
        
        System.out.println(sb);
	}
}
