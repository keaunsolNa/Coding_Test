import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] point = new int[T];
        for(int i = 0; i < T; i++) point[i] = Integer.parseInt(st.nextToken());

        long totalPoint = 0;
        
        switch (T) {
		case 1: 
			
			totalPoint = point[0] * 508;
			break;
			
		case 2 :
			
			totalPoint = point[0] * 508;
			totalPoint += point[1] * 212;
			
			break;
		case 3 :
			
			if(point[0] > point[2]) totalPoint = (point[0] - point[2]) * 508;
			else totalPoint = (point[2] - point[0]) * 108;			
			
			totalPoint += point[1] * 212;
			break;
			
		case 4 :
			
			if(point[0] > point[2]) totalPoint = (point[0] - point[2]) * 508;
			else totalPoint = (point[2] - point[0]) * 108;
			
			if(point[1] > point[3]) totalPoint += (point[1] - point[3]) * 212;
			else totalPoint += (point[3] - point[1]) * 305;
			
			break;
			
		case 5 :
			
			if(point[0] > point[2]) totalPoint = (point[0] - point[2]) * 508;
			else totalPoint = (point[2] - point[0]) * 108;
			
			if(point[1] > point[3]) totalPoint += (point[1] - point[3]) * 212;
			else totalPoint += (point[3] - point[1]) * 305;
			
			totalPoint += point[4] * 707;
        }
        
        totalPoint *= 4763;
        
        System.out.println(totalPoint);

	}

}
