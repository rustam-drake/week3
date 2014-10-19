//question 7
import java.util.Scanner;

public class CountingLettersRedux_Q7 {
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		boolean stopRequest=false;
		char ch=' ';

		System.out.print("Type out your sentance here:");
		String str=scan.nextLine();
		
		while (stopRequest==false){
			int counter=0;
			System.out.print("Which letter would you like to count:");
			String strChar2=scan.nextLine();
			char ch2=strChar2.charAt(0);
			if(ch==ch2)stopRequest=true;
			
			for(int i=0;i<str.length();i++){
				if(ch2==str.charAt(i))counter++;
			}
			
			System.out.println("\""+ch2+"\" is seen "+counter+" times");
			ch=ch2;
		}
		System.out.print("Finished");
		
	}
}
