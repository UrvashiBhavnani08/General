import java.util.Scanner;

class KmToMiles
{
   public static void main(String args[])
   {
	/*
	System.out.println("Please Enter your name: ");
	Scanner sc = new Scanner(System.in);
	String name = sc.next();  only reads a word
	System.out.println("Hello " + name + " have a good day!!!");
	*/

	System.out.println("Please Enter Kilometers to convert it into miles: ");
	Scanner sc = new Scanner(System.in);
	int km = sc.nextInt();
	double miles = 0.621371;
	double result = miles*km;		
	System.out.println(km + " km to miles is: "+result);
   }
}