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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
      
        st = new StringTokenizer(br.readLine());
        
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        
        if ((s >= (a + 1) && s <= (b - 1)) && (t >= (a + 1) && t <= (b - 1)))
        {
        	bw.write("City");
        }
        
        // 지방1에서 시작해서 지방1에서 종료
        else if ((s >= 1 && s <= a) && (t >= 1 && t <= a))
        {
        	bw.write("Outside");
        }
        
        // 지방2에서 시작해서 지방2에서 종료
        else if ((s >= b && s <= n) && (t >= b && t <= n))
        {
        	bw.write("Outside");        	
        }
        else
        {
        	bw.write("Full");
        }
        bw.flush();
        bw.close();
        br.close();
   
    }
}
