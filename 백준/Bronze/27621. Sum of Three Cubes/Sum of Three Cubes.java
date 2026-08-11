import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[][] a = {
		     {0, 0, 0},
		     {0, 0, 1},
		     {0, 1, 1},
		     {1, 1, 1},
		     {0},
		     {0},
		     {-1, -1, 2},
		     {0, -1, 2},
		     {0, 0, 2},
		     {0, 1, 2},
		     {1, 1, 2},
		     {-2, -2, 3},
		     {7, 10, -11},
		     {0},
		     {0},
		     {-1, 2, 2},
		     {-511, -1609, 1626},
		     {1, 2, 2},
		     {-1, -2, 3},
		     {0, -2, 3},
		     {1, -2, 3},
		     {-11, -14, 16},
		     {0},
		     {0},
		     {-2901096694L, -15550555555L, 15584139827L},
		     {-1, -1, 3},
		     {0, -1, 3},
		     {0, 0, 3},
		     {0, 1, 3},
		     {1, 1, 3},
		     {-283059965, -2218888517L, 2220422932L},
		     {0},
		     {0},
		     {8866128975287528L, -8778405442862239L, -2736111468807040L},
		     {-1, 2, 3},
		     {0, 2, 3},
		     {1, 2, 3},
		     {0, -3, 4},
		     {1, -3, 4},
		     {117367, 134476, -159380},
		     {0},
		     {0},
		     {-80538738812075974L, 80435758145817515L, 12602123297335631L},
		     {2, 2, 3},
		     {-5, -7, 8},
		     {2, -3, 4},
		     {-2, 3, 3},
		     {6, 7, -8},
		     {-23, -26, 31},
		     {0},
		};
				 
		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a[N].length; i++) sb.append(a[N][i] + " ");
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
		
	}
}
