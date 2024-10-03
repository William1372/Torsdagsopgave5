import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		System.out.println("Please, type your name...");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello "+name+"! Please type your age...");
		int age = scanner.nextInt();
		System.out.println("You are "+age+" years old!");
		int retirement = 67;
		int retirementAge = retirement - age;
		System.out.println("This means that you are only "+retirementAge+" years away from retiring!");

	}

}