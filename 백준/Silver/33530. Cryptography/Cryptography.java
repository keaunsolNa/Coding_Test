import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        BigInteger target = new BigInteger(br.readLine());

        bw.write(target.isProbablePrime(1) ? "SAFE" : "BROKEN");
        bw.flush();
        bw.close();
        br.close();
    }
	
}
