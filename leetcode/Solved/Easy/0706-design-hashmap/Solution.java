class MyHashMap {

	private int[] data;
	private static final int MAX_SIZE = 1000001;
	private static final int EMPTY_VALUE = -1;

	public MyHashMap() {
		data = new int[MAX_SIZE];
		Arrays.fill(data, EMPTY_VALUE);
	}

	public void put(int key, int value) {
		data[key] = value;
	}

	public int get(int key) {
		return data[key];
	}

	public void remove(int key) {
		data[key] = EMPTY_VALUE;
	}
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */