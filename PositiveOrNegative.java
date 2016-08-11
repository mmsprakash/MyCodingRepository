import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input");
		int iVar = scan.nextInt();
		if(iVar==0){
			System.out.println("The Given Number is Zero");			
		}
		else if(iVar<0){
			System.out.println("The Given Number is Negative");
		}
		else if(iVar>0){
			System.out.println("The Given Number is Positive");
		}
		scan.close();			
	}
}