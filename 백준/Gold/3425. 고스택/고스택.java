import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    private static class Node {
		int index;
		int num;

		Node(int index) {
			this.index = index;
		}

		Node(int index, int num) {
			this.index = index;
			this.num = num;
		}
	}


	private static class KeroStack {
		long[] data;
		int size;

		KeroStack() {
			data = new long[1001];
			size = 0;
		}

		void init() {
			size = 0;
		}

		void add(int num) {
			data[size++] = num;
		}

		boolean function(Node n) {
			switch (n.index) {
			case NUM:
				data[size++] = n.num;
				break;
			case POP:
				if (size == 0) {
					return false;
				}
				size--;
				break;

			case INV:
				if (size == 0) {
					return false;
				}
				data[size - 1] = -data[size - 1];
				break;
			case DUP:
				if (size == 0) {
					return false;
				}
				data[size] = data[size - 1];
				size++;
				break;
			case SWP:
				if (size <= 1) {
					return false;
				}
				long temp = data[size - 1];
				data[size - 1] = data[size - 2];
				data[size - 2] = temp;
				break;
			case ADD:
				if (size <= 1) {
					return false;
				}
				data[size - 2] += data[size - 1];
				size--;
				break;
			case SUB:
				if (size <= 1) {
					return false;
				}
				data[size - 2] -= data[size - 1];
				size--;
				break;
			case MUL:
				if (size <= 1) {
					return false;
				}
				data[size - 2] *= data[size - 1];
				size--;
				break;
			case DIV:
				if (size <= 1) {
					return false;
				} else if (data[size - 1] == 0) {
					return false;
				}

				data[size - 2] /= data[size - 1];
				size--;
				break;
			case MOD:
				if (size <= 1) {
					return false;
				} else if (data[size - 1] == 0) {
					return false;
				}
				data[size - 2] %= data[size - 1];
				size--;
				break;
			}

			if (size == 0) {
				return true;
			}

			if (data[size - 1] > 1000000000 || data[size - 1] < -1000000000) {
				return false;
			}
			return true;
		}
	}

	private static class KeroList {
		Node[] data;
		int size;
		int capacity = 8;

		KeroList() {
			data = new Node[capacity];
			size = 0;
		}

		void init() {
			size = 0;
		}

		void reallocate() {
			capacity <<= 1;
			Node[] temp = new Node[capacity];
			for (int i = 0; i < size; i++) {
				temp[i] = data[i];
			}
			data = temp;
		}

		void add(Node n) {
			if (size == capacity) {
				reallocate();
			}
			data[size++] = n;
		}

		Node get(int index) {
			return data[index];
		}
	}

	private static void simulation() throws IOException {
		int listSize = keroList.size;
		for (int i = 0; i < listSize; i++) {

			if (!keroStack.function(keroList.get(i))) {
				bw.append("ERROR\n");
				return;
			}
		}
		if (keroStack.size != 1) {
			bw.append("ERROR\n");
		} else {
			bw.append(Long.toString(keroStack.data[0]) + "\n");
		}
		return;
	}

	private static int stoi(String input) {
		return Integer.parseInt(input);
	}
	
	private static final int NUM = 0, POP = 1, INV = 2, DUP = 3, SWP = 4, ADD = 5, SUB = 6, MUL = 7, DIV = 8, MOD = 9;
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static KeroList keroList = new KeroList();
	private static KeroStack keroStack = new KeroStack();
	private static int size;
	public static void main(String[] args) throws IOException { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		String input = null;
		do {
			st = new StringTokenizer(br.readLine());
			input = st.nextToken();
			switch (input) {
			case "NUM":
				keroList.add(new Node(NUM, stoi(st.nextToken())));
				break;
			case "POP":
				keroList.add(new Node(POP));
				break;
			case "INV":
				keroList.add(new Node(INV));
				break;
			case "DUP":
				keroList.add(new Node(DUP));
				break;
			case "SWP":
				keroList.add(new Node(SWP));
				break;
			case "ADD":
				keroList.add(new Node(ADD));
				break;
			case "SUB":
				keroList.add(new Node(SUB));
				break;
			case "MUL":
				keroList.add(new Node(MUL));
				break;
			case "DIV":
				keroList.add(new Node(DIV));
				break;
			case "MOD":
				keroList.add(new Node(MOD));
				break;
			case "END":
				st = new StringTokenizer(br.readLine());
				size = stoi(st.nextToken());
				for (int i = 0; i < size; i++) {
					st = new StringTokenizer(br.readLine());
					keroStack.init();
					keroStack.add(stoi(st.nextToken()));
					simulation();
				}
				bw.append("\n");
				keroList.init();
				st = new StringTokenizer(br.readLine());
				break;
			}
		} while (!input.equals("QUIT"));
		bw.flush();
		bw.close();

	} 
}