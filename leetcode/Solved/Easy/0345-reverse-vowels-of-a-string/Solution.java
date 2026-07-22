class Solution {
    public String reverseVowels(String s) {
        
        char[] arr = s.toCharArray();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            
            switch (arr[i]) {

                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                case 'A' :
                case 'E' :
                case 'I' :
                case 'O' : 
                case 'U' : 
                    list.add(i);
                
            }

        }

        for (int i = 0; i < list.size() / 2; i++) {
            
            int idx = list.get(i);
            int idx2 = list.get(list.size() - i - 1);

            char temp = arr[idx];
            arr[idx] = arr[idx2];
            arr[idx2] = temp;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : arr) sb.append(c);

        return sb.toString();
    }
}