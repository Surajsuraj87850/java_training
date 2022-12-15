package day12;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a =30, b=0;
			int c=a/b;
			System.out.println("result ="+c);
		}
		catch(ArithmeticException e){
			System.out.println("cant divide by zero");
			
		}
		try {
			try {
			int num = Integer.parseInt("suraj");
			System.out.println(num);
		}
		
		catch(NumberFormatException e) {
			System.out.println("number format exception");
		}
		try {
			int a[]=new int[5];
			a[7]=9;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bounds");
			
		}
		System.out.println("other statement");

	}
		catch(Exception e)
		{
			System.out.println("handeled ");
		}
		finally {
			System.out.println("end");
		}
	}
}
	


