import java.util.Scanner;

class Factorial
{
   public static void main(String args[])
   {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int a = sc.nextInt();
	int i = a;
	int fact = 1;
	for(i=a;i>=1;i--){
		fact *= i;
	}
	System.out.println(fact);
	// System.out.println();
	// 5 = 5*4*3*2*1  
   }
}