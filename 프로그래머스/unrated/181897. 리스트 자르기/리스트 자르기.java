import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        switch(n) {
            case 1 : slicer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1); break;
            case 2 : slicer = Arrays.copyOfRange(num_list, slicer[0], num_list.length); break;
            case 3 : slicer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1); break;
            case 4 : 
                List<Integer> list = new ArrayList<>();
                
                for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]) list.add(num_list[i]);
                
                slicer = new int[list.size()];
                for(int i = 0; i < list.size(); i++) slicer[i] = list.get(i);
        }
        return slicer;
    }
}