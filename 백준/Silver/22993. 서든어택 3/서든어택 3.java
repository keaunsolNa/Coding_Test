import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int[T-1];
        for(int i = 0; i < T-1; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        boolean win = true;
        
        for (int i : arr) {
        	if(target > i) {
        		target += i;
        	} else {
        		win = false;
        		break;
        	}
		}
        
        if(win) {	
        	System.out.print("Yes");
        } else {
        	System.out.print("No");
        }
        		
	}
}
