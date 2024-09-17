import java.util.Random;
public class RandomNumbers {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(); // can 2 number for a limit
		double y = random.nextDouble(); // can 2 number for a limit
		boolean z = random.nextBoolean(); // 50/50 chance of true or false
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
