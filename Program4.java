import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		System.out.println("Hello!");
		System.out.print("What is your age? ");
		age = sc.nextInt();
		
		if (age >= 21) {
			System.out.println("You can legally drink alcohol");
			
		}
		
		else if(age <= 21){
		System.out.println("You are not old enough to consume alcohol");
		}

	}

}
