import java.io.IOException;
import java.util.Random;

public class Main {

   public static void main(String[] args) throws IOException {
		Random random = new Random();
		for(int i = 0; i < 814; i++) {

			int a = random.nextInt(16281) - 8140;
			int b = random.nextInt(16281) - 8140;
			System.out.println(a + " " + b);
		}
   }
}