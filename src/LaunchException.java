import java.util.*;
public class LaunchException {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator");
		int num1=sc.nextInt();//critical statement
		System.out.println("Enter the denominator");
		int num2=sc.nextInt();//critical statement
		double div=num1/num2;//critical statement
		System.out.println(div);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		finally {
			
			System.out.println("Inside finally block");
		}

	}

}
