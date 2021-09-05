// import java.util.Scanner;

class SwitchVowelConsonant
{
   public static void main(String args[])
   {
	// Scanner a = new Scanner(System.in);
	// String letter = a.next();
	char s = 'a';
	switch(s){
		case 'a': System.out.println("a is a vowel.");
			  break;
		case 'e': System.out.println("e is a vowel.");
			  break;
		case 'i': System.out.println("i is a vowel.");
			  break;
		case 'o': System.out.println("o is a vowel");
			  break;
		case 'u': System.out.println("o is a vowel");
			  break;
		default : System.out.println("The letter is a consonant.");
	}
   }
}