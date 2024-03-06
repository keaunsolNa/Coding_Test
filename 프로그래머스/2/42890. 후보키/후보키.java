import java.util.*;
class Solution {
    
    private static String[][] relations;
    private static Stack<Integer> stack;
    private static List<Integer> ans;
    private static boolean[] check;
    private static int row, col;
    
    public int solution(String[][] relation) {

        relations = relation;
        col = relation.length;
        row = relation[0].length;

        ans = new ArrayList<>();
        
        for (int i = 0; i < row; i++) {
            
            stack = new Stack<>();
            check = new boolean[row];
            comb(0, i + 1);
        }
  
        return ans.size();
    }
    
    private static void comb(int pos, int r) {
        
        if (stack.size() == r) {
            
            List<Integer> res = new ArrayList<>();
            for (int num : stack) res.add(num);
            
            if (isSubKey(res)) {
                
                int cur = 0;
                for (int num : res) cur |= 1 << (num);
                
                if (!isSubSet(cur)) ans.add(cur);
            }

            return;
        }
        
        for (int i = pos; i < row; i++) {
            
            if (!check[i]) {
                
                check[i] = true;
                stack.push(i);
                comb(i, r);
                stack.pop();
                check[i] = false;
            }
        }
    }
    
    private static boolean isSubKey(List<Integer> rowList) {
        
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < col; i++) {
            
            StringBuilder sb = new StringBuilder();
            for (int row : rowList) sb.append(relations[i][row]);
            
            if(set.contains(sb.toString())) return false;
            
            set.add(sb.toString());
        }
        
        return true;
    }
    
    private static boolean isSubSet(int now) {
        
        for (int i = 0; i < ans.size(); i++) {
            int ansData = ans.get(i);
            if ((ansData & now) == ansData) return true;
        }
        
        return false;
        
    }
}