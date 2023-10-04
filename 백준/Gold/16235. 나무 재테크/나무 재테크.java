import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    private static int N, M, K;
	private static int[][] A;
	private static int[][] map;
	private static ArrayList<Tree> trees = new ArrayList<>();
	private static ArrayList<Tree> liveTrees;
	private static ArrayList<Tree> deadTrees;
	private static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
	private static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
	
    private static class Tree implements Comparable<Tree> {
		int x;
		int y;
		int z;

		Tree(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public int compareTo(Tree t) {
			return this.z - t.z;
		}
	}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		map = new int[N][N];
		A = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = 5;
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			trees.add(new Tree(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken())));
		}

		while (K > 0) {
			liveTrees = new ArrayList<>();
			deadTrees = new ArrayList<>();
			Collections.sort(trees);
			spring();
			summer();
			fall();
			winter();
			K--;
		}
		
		System.out.println(trees.size());
	}
	
	private static void spring() {
		for (int i = 0; i < trees.size(); i++) {
			Tree t = trees.get(i);
			if (t.z > map[t.x][t.y]) {
				deadTrees.add(t);
			} else {
				map[t.x][t.y] -= t.z;
				t.z += 1;
				liveTrees.add(t);
			}
		}
		trees.clear();
		trees.addAll(liveTrees);
	}

	private static void summer() {
		for (int i = 0; i < deadTrees.size(); i++) {
			Tree t = deadTrees.get(i);
			map[t.x][t.y] += t.z / 2;
		}
	}

	private static void fall() {
		for (int i = 0; i < trees.size(); i++) {
			Tree t = trees.get(i);
			if (t.z % 5 == 0) {
				for (int j = 0; j < 8; j++) {
					int px = t.x + dx[j];
					int py = t.y + dy[j];
					if (0 <= px && px < N && 0 <= py && py < N) {
						trees.add(new Tree(px, py, 1));
					}
				}
			}
		}
	}

	private static void winter() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] += A[i][j];
			}
		}
	}
}
