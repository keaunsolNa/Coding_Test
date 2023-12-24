import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        
        List<int[]> list = new ArrayList<>();
        int idx = 0;
        
        switch(ext) {
                
            case "code" : idx = 0; break;
            case "date" : idx = 1; break;
            case "maximum" : idx = 2; break;
            case "remain" : idx = 3; 
                
        }
         
        for(int i = 0; i < data.length; i++) if(data[i][idx] < val_ext) list.add(data[i]);
        
        
         return answer = convertListToArray(list, sort_by.equals("code") ? 0 : sort_by.equals("date") ? 1 : sort_by.equals("maximum") ? 2 : 3);
        
    }
    
    public static int[][] convertListToArray(List<int[]> list, int sort) {

        return list.stream()
                .sorted(Comparator.comparingInt(arr -> arr[sort]))
                .toArray(int[][]::new);
        
    }
    
}