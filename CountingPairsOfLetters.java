//question 6
import java.util.Scanner;

public class CountingPairsOfLetters {
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		boolean counterLogic=true;

		System.out.println("type a short string here:");
		String strChar=scan.nextLine();
		int chLength=strChar.length();
		
		char[] chList = new char[chLength];
		for(int i=0;i<strChar.length();i++){
			chList[i]=strChar.charAt(i);
		}
		
		System.out.println("Type out your sentance here:");
		String str=scan.nextLine();
		
		int counter=0;
		char ch;
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			counterLogic=true;

			if(ch==chList[0]){
				for(int n=i;n<strChar.length()+i;n++){
					ch=str.charAt(n);
					if(ch!=chList[n-i]) counterLogic=false;
					if (n==str.length()-1) break;
				}
				if (counterLogic==true) counter++;
			}	
			
		}
		System.out.println("\""+strChar+"\" string is seen "+counter+" times");
	}
}
