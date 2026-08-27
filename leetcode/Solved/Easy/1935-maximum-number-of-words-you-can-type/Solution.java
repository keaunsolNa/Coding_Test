import java.util.StringTokenizer;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        List<Character> brokenList = new ArrayList<>();
        for (char c : brokenLetters.toCharArray()) {
            brokenList.add(c);
        }

        StringTokenizer st = new StringTokenizer(text, " ");
        int ans = 0;

        while (st.hasMoreTokens()) {
            
            boolean check = true;
            char[] tokens = st.nextToken().toCharArray();

            for (char c : tokens) {
                
                if (brokenList.contains(c)) {
                    check = false;
                    break;
                }

            }

            ans += check ? 1 : 0;
        }

        return ans;

    }
}