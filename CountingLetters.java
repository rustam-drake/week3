//question 5
import java.util.Scanner;

public class CountingLetters {
	public static void main (String arg[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Write your sentance here:");
		String str=scan.nextLine();
		
		System.out.println("Press the letter that you wish to count (NOTE:this is case sensitive)");
		String strChar=scan.nextLine();
		char ch=strChar.charAt(0);
		
		int counter=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				counter++;
			}
		}
		System.out.println("\""+ch+"\" is seen "+counter+" times");
	}
}
