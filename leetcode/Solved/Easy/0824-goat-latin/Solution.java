class Solution {
    public String toGoatLatin(String sentence) {
        
        String[] st = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < st.length; i++) {

            StringBuilder target = new StringBuilder(st[i]);
            char c = target.toString().charAt(0);
            
            switch (c) {
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
                    target.append("ma");
                    break;

                default : 
                    
                    target.delete(0, 1);
                    target.append(c);
                    target.append("ma");
            }

            for (int j = 0; j < i + 1; j++) target.append("a");

            ans.append(target);
            if (i < st.length - 1 ) ans.append(" ");
        }

        return ans.toString();


    }
}