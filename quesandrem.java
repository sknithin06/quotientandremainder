package Java;
import java.util.Scanner;
public class quesandrem {
	public static void main(String[] args) {
		System.out.println("Welcome to BasicCoreProgram");
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a value of Divisor :");  
		int divisor = sc.nextInt();
		System.out.print("Enter a value of Dividend:"); 
		int dividend = sc.nextInt();
		int Quotient = dividend / divisor;
		int Remainder = dividend % divisor;
		System.out.println("Quotient is:"+Quotient);
		System.out.println("Remainder is:"+Remainder);
	}
}
