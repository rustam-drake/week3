//question 4
import java.util.Scanner;

public class LineToColumn {
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Write your sentance here:");
		String newStr="";
		char ch;
		String str=scan.nextLine();
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			if(ch!=' '){
				newStr+=ch;
			}else{	
				System.out.println(newStr);
				newStr="";
				//i++;
			}
			if (i==str.length()-1) 
				System.out.println(newStr);			
		}
	}
}
