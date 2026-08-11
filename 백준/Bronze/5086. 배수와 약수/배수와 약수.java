import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String temp = br.readLine();
			if(temp.equals("0 0")) {
				break;
			}
			int A = Integer.parseInt(temp.split(" ")[0]);
			int B = Integer.parseInt(temp.split(" ")[1]);
			
			if(B%A == 0) {
				System.out.println("factor");
			} else if(A%B == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
	}
}
