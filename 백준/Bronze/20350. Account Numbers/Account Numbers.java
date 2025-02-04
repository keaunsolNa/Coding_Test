import java.io.*;
import java.math.BigInteger;

public class Main {
	
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        input = input.substring(4) + input.substring(0, 4);
        
        for (char c : input.toCharArray())
        {
        	int t = (int) c;
        	
        	if (t >= 65 && t <= 90)
        	{
        		sb.append(String.valueOf((t - 55)));
        	}
        	else sb.append(c);
        }
        
        BigInteger num = new BigInteger(sb.toString());
        int mod = Integer.parseInt(num.mod(new BigInteger("97")).toString());
        
        bw.write(mod == 1 ? "correct" : "incorrect");
        bw.flush();
        bw.close();
        br.close();
   
    }
}
