package codingTest;

public class Lessons11 {

	public static void main(String[] args) {
		
		Lessons11 lessons11 = new Lessons11();
		
		int price = 2500;
		int money = 1000000000;
		int count = 2500;
		
		long result = lessons11.solution(price, money, count);
		
		System.out.println("RESULT : " + result);
		
	}
	
	 public long solution(int price, int money, int count) {
		 
//		 ���� ���� ���̱ⱸ�� �αⰡ �ſ� ���� ���� ������ �ʽ��ϴ�. �� ���̱ⱸ�� ���� �̿��� price�� �ε�, ���̱ⱸ�� N �� ° �̿��Ѵٸ� ���� �̿���� N�踦 �ޱ�� �Ͽ����ϴ�. 
//		 ��, ó�� �̿�ᰡ 100�̾��ٸ� 2��°���� 200, 3��°���� 300���� ����� �λ�˴ϴ�.
//		 ���̱ⱸ�� count�� Ÿ�� �Ǹ� ���� �ڽ��� ������ �ִ� �ݾ׿��� �󸶰� ���ڶ������ return �ϵ��� solution �Լ��� �ϼ��ϼ���.
//		 ��, �ݾ��� �������� ������ 0�� return �ϼ���.
		 
		 long totalPrice = 0;
		 
		 for(int i = 0; i <= count; i++) {
			 totalPrice += price*i;
		 }
		 
		 System.out.println("TOTALPRICE : " + totalPrice);
		 
		 if(money > totalPrice) {
			 return 0;
		 } else {
			 return  (totalPrice - money);
		 }
		
	    }
}
