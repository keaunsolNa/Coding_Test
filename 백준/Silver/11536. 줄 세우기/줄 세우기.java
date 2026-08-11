import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        String[] name = new String[p];
        
        for(int i = 0; i < p; i++) name[i] = br.readLine();
        
        String[] sort = name.clone();
        String[] sortR = name.clone();
        
        Arrays.sort(sort);
        Arrays.sort(sortR, Collections.reverseOrder());
        
        boolean flag = true;
        boolean flag2 = true;
        for(int i = 0; i < p; i++) {
        	if(!(name[i].equals(sort[i])))flag = false;
        	if(!(name[i].equals(sortR[i])))flag2 = false;
        }
        
        if(flag) System.out.println("INCREASING");
        else if(flag2) System.out.println("DECREASING");
        else System.out.println("NEITHER");
	}
}
