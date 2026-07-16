class Solution {
    public int[] sortByBits(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            
            int count = Integer.bitCount(arr[i]);
            map.put(arr[i], count);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (map.get(o1) == map.get(o2)) return o1.compareTo(o2);
                return map.get(o1).compareTo(map.get(o2));
            }
        });

        int[] answer = new int[arr.length];
        int idx = 0;
        for (Integer key : keySet) {
            answer[idx++] = key;
        }

        return answer;
    }
}