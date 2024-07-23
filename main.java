import java.util.Scanner;
public class main {
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter your first name:");
		String name01 = scanner.nextLine();
		
		System.out.println("Enter your second name:");
		String name02 = scanner.nextLine();
		
		System.out.println("Enter your last name:");
		String name03 = scanner.nextLine();
		
		sb.append(name03);
		sb.append(" ");
		sb.append(name01);
		sb.append(" ");
		sb.append(name02);
		String result = sb.toString();
		
		System.out.println("full name :" +result);
	
		System.out.println("Enter your full name:");
		String name04 = scanner.nextLine();
		
		if(result.equalsIgnoreCase(name04)) {
			System.out.println("Contents are the same");
		}
		else {
			System.out.println("Contents are not the same");
		}
	}
}
