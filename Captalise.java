package geekster;
import java.util.*;

public class Captalise {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		sc.close();
		capstr(str);
		
	}
	public static void capstr(String str) {
		str = str.toUpperCase();
		System.out.println(str);
	}

}
