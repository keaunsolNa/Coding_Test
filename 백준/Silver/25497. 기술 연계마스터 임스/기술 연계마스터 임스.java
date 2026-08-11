import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String s = br.readLine();
        int cnt = 0;
        int cntL = 0;
        int cntS = 0;
        boolean chk = true;
        for (int i = 0; chk && i < s.length(); i++) {
            chk = true;
            switch (s.charAt(i)) {
                case 'L': cntL++; break;
                case 'S': cntS++; break;
                case 'R': if(cntL == 0) chk = false; else {cnt++; cntL--;} break;
                case 'K': if(cntS == 0) chk = false; else {cnt++; cntS--;} break;
                default: cnt++;
            }
        }
        System.out.println(cnt);
	}
}
