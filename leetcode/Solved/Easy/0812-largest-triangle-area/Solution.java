import java.util.*;

class Solution {
    public double largestTriangleArea(int[][] points) {
        
        int maxX = 0;
        int maxY = 0;
        int minX = 99999999;
        int minY = 99999999;
        for (int i = 0; i < points.length; i++) {

            maxX = Math.max(points[i][0], maxX);        
            maxY = Math.max(points[i][1], maxY);
            minX = Math.min(points[i][0], minX);
            minY = Math.min(points[i][1], minY);
        }

        double x = Math.abs(maxX - minX);
        double y = Math.abs(maxY - minY);

        double z = Math.pow(x, 2) + Math.pow(y, 2);

        z = Math.sqrt(z);

        return (Math.round(z*1000)/1000.0);
    }
}