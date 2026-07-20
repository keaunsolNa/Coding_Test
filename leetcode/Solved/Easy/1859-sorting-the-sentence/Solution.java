class Solution {
    public String sortSentence(String s) {
        
        Map<Integer, String> map = new TreeMap<>();
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {

            String str = arr[i].substring(0, arr[i].length() - 1);
            int idx = Integer.parseInt(arr[i].substring(arr[i].length() - 1));

            map.put(idx, str);
        }

        String answer = "";
        for (int i = 0; i < map.size(); i++) {
            answer += map.get(i);

            if (i < map.size()) answer += " ";
        }

        return answer;


    }
}