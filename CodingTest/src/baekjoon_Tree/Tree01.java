package baekjoon_Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
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
		test02();
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
	
	
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		while(N --> 0) {
			
			int nodeP = Integer.parseInt(st.nextToken());
			
		}
	}
	
	
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	
	
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
	}
	
}
