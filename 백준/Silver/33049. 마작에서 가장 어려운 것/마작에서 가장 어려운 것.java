import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
      
        int p3 = Integer.parseInt(st.nextToken());
        int p4 = Integer.parseInt(st.nextToken());
        int p0 = Integer.parseInt(st.nextToken());

        boolean flag = false;
        for (int i = 0; i<= p0; ++i)
        {
        	if (((p3 + i) % 3 == 0) && ((p4 + p0 - i) % 4 == 0))
        	{
        		flag = true;
        		bw.write(((p3 + i) / 3) + " " + ((p4 + p0 - i) / 4));
        		break;
        	}
        }

        if (!flag) bw.write("-1");
        bw.flush();
        bw.close();
        br.close();
   
    }
    
}
