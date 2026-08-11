import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		char BG;
		String F;
		String M;
		int f;
		String i;
		int I;
		int Ftall;
		int Mtall;
		int Ctall;
		boolean odd;
		
		int T = Integer.parseInt(br.readLine());
		for(int t = 1; t <= T; t++) {
			
			st = new StringTokenizer(br.readLine());
			BG = st.nextToken().charAt(0);
			F = st.nextToken();
			M = st.nextToken();
			
			f = Integer.parseInt(F.split("'")[0]);
			i = F.split("'")[1];
			I = Integer.parseInt(i.substring(0, i.length() - 1));
			Ftall = f * 12 + I;

			f = Integer.parseInt(M.split("'")[0]);
			i = M.split("'")[1];
			I = Integer.parseInt(i.substring(0, i.length() - 1));
			Mtall = f * 12 + I;;

			Ctall = Ftall + Mtall + (BG == 'G' ? -5 : 5);
			
			odd = ((Ctall & 1) == 1) ? true : false;
			Ctall /= 2;
			
			System.out.print("Case #" + t + ": ");
			
			if(odd) {
				
				print(Ctall - 3);
                System.out.print(" to ");
                print(Ctall + 4);
                System.out.println();
                
			} else {
				
				print(Ctall - 4);
				System.out.print(" to ");
				print(Ctall + 4);
				System.out.println();
			}
		}
	}

	public static void print(int x) {
		
		System.out.print(x / 12 + "'" + x % 12 + "\"");
	}
}
