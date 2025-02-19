import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        double length = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        double t = Double.parseDouble(br.readLine());

        boolean canWin = false;
        while (n --> 0)
        {
        	st = new StringTokenizer(br.readLine());
        	double f = Double.parseDouble(st.nextToken());
        	double b = Double.parseDouble(st.nextToken());
        
        	double total = (length / f) + (length / b);
        	if (total < t) canWin = true;
        	
        }

        bw.write(canWin ? "HOPE" : "DOOMED");
        bw.flush();
        bw.close();
        br.close();
    }
	
}
