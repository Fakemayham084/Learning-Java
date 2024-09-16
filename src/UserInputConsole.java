import java.util.Scanner; // scanner package


public class UserInputConsole {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // saying the scanner is here
		
		System.out.println("What is your name?"); // question string only
		String name = scanner.nextLine(); // get the user string
		System.out.println("How old are you?"); // question INT only
		int age = scanner.nextInt(); // handle INT reply
		scanner.nextLine(); // clears \n
		System.out.println("What is your favorite food?"); // question string only
		String food = scanner.nextLine()
;		
		// Prints
		System.out.println("Hello " + name);
		System.out.println("You Are " + age + "years old");
		System.out.println("You like " + food);
	}

}
