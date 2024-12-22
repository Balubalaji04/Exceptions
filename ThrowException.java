import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		try {
			showException();
		}
		catch(ArithmeticException e){
			System.out.println("Exception from diffrent function");
		}
		catch(InputMismatchException e1) {
			System.out.println("Input is not valid");
		}
		catch(NegativeArraySizeException e2) {
		System.out.println("Array Size Cannot be Negative");
		}
		catch(ArrayIndexOutOfBoundsException e3) {
		System.out.println("Specific index is out of range");
		}
	}
	static void showException() {
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
	catch(ArithmeticException e){
		throw e;
		}
	catch(InputMismatchException e1) {
		throw e1;
	}
		catch(NegativeArraySizeException e2) {
			throw e2;
		}
		catch(ArrayIndexOutOfBoundsException e3) {
			throw e3;
		}
	}
}