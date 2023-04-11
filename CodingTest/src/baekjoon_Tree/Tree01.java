package baekjoon_Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tree01 {
    
	private static class Node{
		char root;
		Node left;
		Node right;
		
		Node(char root, Node left, Node right){
			this.root = root;
			this.left = left;
			this.right = right;
		}
	}

	private static Node head = new Node('A', null, null);
	private static void insertNode(Node temp, char root, char left, char right) {
		
		
		if (temp.root == root) {
			
			temp.left = (left == '.' ? null : new Node(left, null, null));
			temp.right = (right == '.' ? null : new Node(right, null, null)); 
		}
		
		else {
			
			if(temp.left != null) insertNode(temp.left, root, left, right);
			if(temp.right != null) insertNode(temp.right, root, left, right);
			
		}
		
	}
	
    private static HashMap<String, ArrayList<String>> edges;
    private static boolean search(String cur, String ed) {
        if (cur.equals(ed)) return true;
        
        if (edges.get(cur) == null) return false;
        for (String next : edges.get(cur)) 
            if (search(next, ed)) return true;
        
        return false;
    }

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	// 1991번 - 트리 순회
	public static void test01() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {
        	st = new StringTokenizer(br.readLine());
        	
        	insertNode(head, st.nextToken().charAt(0), st.nextToken().charAt(0), st.nextToken().charAt(0));
        }

        preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);
        
	}
	
	private static void preOrder(Node node) {
		
		if(node == null) return;
		System.out.print(node.root);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	private static void inOrder(Node node) {
		
		if(node == null) return;
		inOrder(node.left);
		System.out.print(node.root);
		inOrder(node.right);
	}
	
	private static void postOrder(Node node) {
		
		if(node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.root);
	}
	
	// 25601번 - 자바의 형변환
	public static void test02() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        edges = new HashMap<>();
        
        for (int i = 0; i < n - 1; i++) {
        	
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            
            if (!edges.containsKey(a)) edges.put(a, new ArrayList<>());
            edges.get(a).add(b);
        }

        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        
        System.out.println(search(a, b) || search(b, a) ? 1 : 0);

	}
	
	// 1068번 - 트리
	private static int[] parent;
	private static int n;
	private static int count;
	private static boolean[] visited;
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		n = Integer.parseInt(br.readLine());
        parent = new int[n];
        visited = new boolean[n];
        int root = 0;
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            parent[i] = Integer.parseInt(st.nextToken());        
            if(parent[i] == -1) root = i;
        }

        int remove = Integer.parseInt(br.readLine());
        
        deleteNode(remove);
        countLeaf(root);
        
        System.out.println(count);
	}
	
	private static void deleteNode(int d) {
        parent[d] = -2; 
        for(int i = 0; i < n; i++) {
            if(parent[i] == d) {
                deleteNode(i);
            }
        }
    }
    
    private static void countLeaf(int s) {
        boolean isLeaf = true;
        visited[s] = true;
        if(parent[s] != -2) {
            for(int i = 0; i < n; i++) {
                if(parent[i] == s && visited[i] == false) {
                    countLeaf(i);
                    isLeaf = false;
                }
            }
            if(isLeaf) count++;
        }
    }
	
    // 6615번 - 콜라츠 추측
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			long a = Integer.parseInt(st.nextToken());
			long b = Integer.parseInt(st.nextToken());
			int A = (int)a;
			int B = (int)b;
			
			if(a == 0 && b == 0) break;
			List<Long> arr1 = new ArrayList<>();
			List<Long> arr2 = new ArrayList<>();
			
			arr1.add(a);
			arr2.add(b);
			
			while(a != 1) {
				a = a % 2 == 0 ? a / 2 : a * 3 + 1;
				arr1.add(a);
			}
			
			while(b != 1) {
				b = b % 2 == 0 ? b / 2 : b * 3 + 1;
				arr2.add(b);
			}
			
			long SA = 0;
			long SB = 0;
			long C = 0;
			for(int i = 0; i < arr1.size(); i++) {
				
				if(arr2.contains(arr1.get(i))) {
					SA = i;
					SB = arr2.indexOf(arr1.get(i));
					C = arr1.get(i);
					break;
				}
			}
			
			sb.append(A +" needs " + SA + " steps, " + B + " needs " + SB + " steps, they meet at " + C);
			sb.append("\n");
		}

		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// 11725번 - 트리의 부모 찾기
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
		for(int i = 0; i < n; i++) tree.add(new ArrayList<>());

		for(int i = 0; i < n - 1; i++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			tree.get(a).add(b);
			tree.get(b).add(a);
		}

		boolean[] visited = new boolean[n]; 
		int[] pNode = new int[n]; 

		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		visited[0] = true;
		while (!queue.isEmpty()) {
			int v = queue.poll();
			for (int node : tree.get(v))
				if (!visited[node]) {
					visited[node] = true;
					queue.add(node);
					pNode[node] = v; 
				}
		}

		for(int i = 1; i < n; i++) System.out.println(pNode[i] + 1);
		
	}

	
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	
}
