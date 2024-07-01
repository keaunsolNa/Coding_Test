import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(bf.readLine());

		while (N > 0) {
			st = new StringTokenizer(bf.readLine());
			int R = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			String binary_num = st.nextToken();

			int r = R;
			int c = C;

			String[][] matrix = new String[R][C];
			int k = 0;
			int tmp = 1;
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					matrix[i][j] = binary_num.substring(k++, tmp++);
				}
			}
			
			String[] words = new String[R * C];
			int index = 0;
			int x = 0;
			int y = 0;
			R--;
			int flag=1;
			while (index < words.length) {

				for (int i = 0; i < C; i++) {
					words[index++] = matrix[x][y];
					y+=flag;
				}
				x+=flag;
				y+=flag*-1;
				C--;

				if (index>=words.length)
					break;

				for (int i = 0; i < R; i++) {
					words[index++] = matrix[x][y];
					x+=flag;
				}
				x+=flag*-1;
				y+=flag*-1;
				R--;
				flag*=-1;
			}

			int integ = 0;
			char alph = ' ';
			String sr;
			ArrayList<String> arr = new ArrayList<String>();
			for (int i = 0; i < (r * c / 5); i++) {
				sr = "";
				for (int j = 0; j < 5; j++) {
					sr = sr + words[i * 5 + j];
				}
				arr.add(sr);
			}
			if (arr.size() != 0) {
				while (arr.get(arr.size() - 1).equals("00000")) {
					arr.remove(arr.size() - 1);
					if(arr.size()==0)
						break;
				}
				if (arr.size() != 0) {
					while (arr.get(0).equals("00000")) {
						arr.remove(0);
						if(arr.size()==0)
							break;
					}
				}
				while (arr.size() > 0) {
					integ = Integer.parseInt(arr.remove(0), 2);
					if (integ != 0) {
						alph = (char) (integ + 64);
						System.out.print(alph);

					} else
						System.out.print(" ");

				}

			}

			System.out.println();
			N--;

		}

	}

}