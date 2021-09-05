import java.util.Scanner;

class LeapYear
{
   public static void main(String args[])
   {
	System.out.println("Please enter a year: ");
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	boolean leapyear = false;
	if((year % 4) == 0){
		if((year % 100) == 0){
			if((year % 400) == 0){
				leapyear = true;
			}
			else{
				leapyear = false;
			}
		}
		else{
			leapyear = true;
		}
	}
	else{
		leapyear = false;
	}
	if(leapyear){
		System.out.println("The enetered year is a leap year.");
	}
	else{
		System.out.println("The enetered year is not a leap year.");
	}
   }
}