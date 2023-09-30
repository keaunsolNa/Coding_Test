import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        
        int rows = picture.length * k;
        int cols = picture[0].length() * k;

        String[] answer = new String[rows];

        for (int i = 0; i < rows; i++) {
            
            StringBuilder sb = new StringBuilder();
            int row = i / k;

            for (int j = 0; j < cols; j++) {
                int col = j / k;
                char pixel = picture[row].charAt(col);
                sb.append(pixel);
            }

            answer[i] = sb.toString();
        }

        return answer;
    }
}