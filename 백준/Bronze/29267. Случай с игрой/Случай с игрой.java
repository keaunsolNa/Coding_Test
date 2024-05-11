import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder out = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	boolean isSave = false;
    	int ammo = 0;
    	int saveAmmo = 0;
    	while (n --> 0) {
    		
    		String doing = br.readLine();
    		
    		switch(doing) {
    		
    			case "save" : {
    				
    				isSave = true;
    				 saveAmmo = ammo;
    				 break;
    				 
    			}
    			case "load" :	{

    				if (!isSave) ammo = 0;
    				else ammo = saveAmmo;
    				break;
    				
    			}
    				
    			case "shoot" :	{
    				
    				ammo--;
    				break;
    				
    			}
    			
    			case "ammo" : {
    				
    				ammo += k;
    				break;
    				
    			}
    			
    		}
    		System.out.println(ammo);
    	}


    }
}
