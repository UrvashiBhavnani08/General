import java.util.Scanner;

class VowelOrConsonant
{
   public static void main(String args[])
   {
	System.out.println("Please enter  a character: ");
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	if(ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u'){
		System.out.println("The entered character is a vowel.");
	}
	else if(ch == 'A' | ch == 'E' | ch == 'I' | ch == 'O' | ch == 'U'){
		System.out.println("The enetered character is a vowel.");
	}
	else{
		System.out.println("The entered character is a consonant.");
	}
   }
}