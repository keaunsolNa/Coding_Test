package codingTestLevel0;

public class Lessons29 {
	
	// 옷가게 할인 받기
    public int solution(int price) {
        
        if(price >= 500000){
            return price*(100-20)/100;
        } else if(price >= 300000){
            return price*(100-10)/100;
        } else if(price >= 100000){
            return price*(100-5)/100;
        } else {
            return price;
        }
        
    }
}