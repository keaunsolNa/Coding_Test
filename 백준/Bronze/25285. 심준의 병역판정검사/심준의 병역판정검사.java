import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st; 
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			double height = Double.parseDouble(st.nextToken());
			double weight = Double.parseDouble(st.nextToken());
			double bmi = weight/(height*height/10000);
			
			if(height < 140.1) {
				
				System.out.println(6);
				
			} else if(height < 146) {
				
				System.out.println(5);
				
			} else if(height < 159) {
				
				System.out.println(4);
				
			} else if(height < 161) {
				
				if(bmi >= 16 && bmi < 35){
                    System.out.println(3);
                }else{
                    System.out.println(4);
                }
				
			} else if(height < 204) {
				
				 if(bmi >= 20 && bmi < 25){
					 
                    System.out.println(1);
                    
                }else if(bmi >= 18.5 && bmi < 20){
                	
                    System.out.println(2);
                    
                }else if(bmi >= 25 && bmi < 30){
                	
                    System.out.println(2);
                    
                }else if(bmi >= 16 && bmi < 18.5){
                	
                    System.out.println(3);
                    
                }else if(bmi >= 30 && bmi < 35){
                	
                	System.out.println(3);
                	
                }else{
                	
                    System.out.println(4);
                    
                }
				 
			} else {
				
				System.out.println(4);
				
			}
			
		}
		
		
	}
}
