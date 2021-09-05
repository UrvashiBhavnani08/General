import java.util.Scanner;

class CalculatorStrings
{
   public static void main(String args[])
   {
	double result;
	System.out.println("This is the Calculator");
	System.out.println("Please Enter the first number: ");
	Scanner in = new Scanner(System.in);
	int num1 = in.nextInt();
	System.out.println("Please enter the second number: ");
	// Scanner b = new Scanner(System.in);
	int num2 = in.nextInt();
	System.out.println("Please enter the operation you want to perform: ");
	System.out.println("add/sub/div/mul/floor/mod");
	Scanner opr = new Scanner(System.in);
	String operation =opr.next();
	if(operation.equals("add")){
		// System.out.println("This is the addition section");
		result = num1 + num2;
		System.out.println("The addition of two numbers is: "+result);
	}
	else if(operation.equals("sub")){	
		result = num1 - num2;
		System.out.println("The subtraction of two numbers is: "+result);
	}
	else if(operation.equals("div")){
		result = num1*num2;
		System.out.println("The multiplication of two numbers is: "+result);
	}
	else if(operation.equals("mul")){
		result = num1 / num2;
		System.out.println("The division of two numbers is: "+result);
	}
	else if(operation.equals("floor")){
		result = num1 / num2;
		double answer = Math.floor(result);
		System.out.println("The floor division of two numbers is: "+answer);
	}
	else if(operation.equals("mod")){
		result = num1 % num2;
		System.out.println("The modulo of two numbers is: "+result);
	}
	else{
		System.out.println("I cannot understand that what you are looking for...Sorry Try again later..Bye.");
	}
   }
}