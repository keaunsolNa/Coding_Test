import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   StringBuilder binary = new StringBuilder(Integer.toBinaryString(N));
	   
	   while(binary.length() != 32) binary.insert(0, "0");
	   
	   StringBuilder complement = new StringBuilder();
	   
	   for(int i = 0; i < binary.length(); i++) 
		   complement.append(binary.charAt(i) == '0' ? '1' : '0');
	   
	   complement = addBinaryPlus(complement.toString(), "1");
	   
	   int ans = 0;
	   for(int i = 0; i < 32; i++) {
		   
		   ans += binary.charAt(i) == complement.charAt(i) ? 0 : 1; 
	   }
	   
	   System.out.println(ans);
   }

   private static StringBuilder addBinaryPlus(String a, String b) {

	   BigInteger aInt = new BigInteger(a, 2);
       BigInteger bInt = new BigInteger(b, 2);
       BigInteger sum = aInt.add(bInt);

       return new StringBuilder(sum.toString(2));
       
   }
}
