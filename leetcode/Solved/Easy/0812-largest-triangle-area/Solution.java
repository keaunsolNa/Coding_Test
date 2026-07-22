class Solution {
    public double largestTriangleArea(int[][] points) {
        
        double maxArea = 0;
      
        for (int[] point1 : points) {
            int x1 = point1[0];
            int y1 = point1[1];
          
            for (int[] point2 : points) {
                int x2 = point2[0];
                int y2 = point2[1];
              
                for (int[] point3 : points) {
                    int x3 = point3[0];
                    int y3 = point3[1];
                  
                    int vectorX1 = x2 - x1;
                    int vectorY1 = y2 - y1;
                    int vectorX2 = x3 - x1;  
                    int vectorY2 = y3 - y1;  
                  
                    double currentArea = Math.abs(vectorX1 * vectorY2 - vectorX2 * vectorY1) / 2.0;
                  
                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
      
        return maxArea;
    }
}