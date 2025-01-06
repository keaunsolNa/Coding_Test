import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
      
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 1; i <= n; i++)
        {
        	String key = st.nextToken();
        	map.put(key, map.getOrDefault(key, 0) + 1);
        	
        	if (map.get(key) > 4)
        	{
        		ans = i;
        		break;
        	}
        }
      
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
   
    }
    
}
