import java.util.InputMismatchException;
import java.util.Scanner;

public class SpecificCatch {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numerator");
			int num1=sc.nextInt();//critical statement
			System.out.println("Enter the denominator");
			int num2=sc.nextInt();//critical statement
			double div=num1/num2;//critical statement
			System.out.println(div);
			System.out.println("Array Operation");
			System.out.println("Enter The Array Size:");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the position number:");
			int pos=sc.nextInt();
			System.out.println("Enter the value to be added");
			int val=sc.nextInt();
			arr[pos]=val;
			System.out.println("Data added");
			}
			catch(InputMismatchException e1) {
				System.out.println("Input is not valid");
			}
			catch(ArithmeticException e2) {
			System.out.println("Arthimetic Exception occured");
			}
			catch(NegativeArraySizeException e3) {
			System.out.println("Array Size Cannot be Negative");
			}
			catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("Specific index is out of range");
			}
		//Generic catch
			catch(Exception e) {
				System.out.println("Exception handled");
			}

	}

}
