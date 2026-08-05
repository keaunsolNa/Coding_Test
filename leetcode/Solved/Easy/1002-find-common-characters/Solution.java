class Solution {
    public List<String> commonChars(String[] words) {

        int[] arr = new int[26];
        Arrays.fill(arr, 101);

        for (String str : words) {
    
            Map<Character, Integer> map = new HashMap<>();


            for (char c : str.toCharArray()) {

                map.put(c, map.getOrDefault(c, 0) + 1);
            }


            for (char c : map.keySet()) {
                
                map.putIfAbsent(c, 0);
                arr[c - 'a'] = Math.min(map.get(c), arr[c - 'a']);
            }

            System.out.print(map);
        }


        for (int c : arr) System.out.print(c);
        System.out.println();


        List<String> answer = new ArrayList<>();

        for (int i = 0; i < 26; i++) {

            if (arr[i] > 0) {
                
                char target = (char)('a' + i);
                System.out.println(target);
                for (int j = 0; j < arr[i]; j++) answer.add(String.valueOf(target));
            }
        }

        return answer;

    }
}