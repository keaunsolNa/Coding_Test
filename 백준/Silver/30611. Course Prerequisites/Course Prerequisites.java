import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();
        while (m --> 0)
        {
        	set.add(st.nextToken());
        }

        int n = Integer.parseInt(br.readLine());
        boolean flag = true;
        st = new StringTokenizer(br.readLine());
        while (n --> 0)
        {
        	
        	if (!set.contains(st.nextToken()))
        	{
        		flag = false;
        		break;
        	}
        }
        
        bw.write(!flag ? "0" : "1");
        bw.flush();
        bw.close();
        br.close();

    }
}
