import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int length = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < length; i++) {
        	
            String base = br.readLine();
            
            int x_start = Integer.parseInt(base.split(" ")[0]);
            int y_start = Integer.parseInt(base.split(" ")[1]);
            
            int x_end = Integer.parseInt(base.split(" ")[2]);
            int y_end = Integer.parseInt(base.split(" ")[3]);
            
            int through = 0;
            
            int count = Integer.parseInt(br.readLine());
            
            for (int j = 0; j < count; j++) {
            	
                String circle = br.readLine();
                
                int x = Integer.parseInt(circle.split(" ")[0]);
                int y = Integer.parseInt(circle.split(" ")[1]);
                int r = Integer.parseInt(circle.split(" ")[2]);
                
                boolean hasStartContain = hasContain(x_start, y_start, x, y, r);
                boolean hasEndContain = hasContain(x_end, y_end, x, y, r);
                
                if (!(hasStartContain && hasEndContain) && (hasStartContain || hasEndContain)) {
                    through++;
                }
            }
            
            System.out.println(through);
        }
	}
    
    private static boolean hasContain(int xo, int yo, int x, int y, int r){
        return Math.sqrt(Math.pow(xo - x, 2) + Math.pow(yo - y, 2)) < r;
    }
}