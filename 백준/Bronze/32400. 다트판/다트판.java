import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[20];
        double total = 0;
        int idx = 0;
        
        for (int i = 0; i < 20; i++)
        {
        	arr[i] = Integer.parseInt(st.nextToken());
        	total += arr[i];
        	if (arr[i] == 20) idx = i;
        }

        double total2 = 0;
        if (idx == 0)
        {
        	total2 = arr[19] + arr[0] + arr[1];
        }
        
        else if (idx == 19)
        {
        	total2 = arr[18] + arr[19] + arr[0];
        }
        else 
        {
        	total2 = arr[idx - 1] + arr[idx] + arr[idx + 1];
        }
        
        
        bw.write(total2 / 3.0 > total / 20.0 ? "Alice" : total2 / 3.0 < total / 20.0 ? "Bob" : "Tie");
        bw.flush();
        bw.close();
        br.close();
    }
    
}
