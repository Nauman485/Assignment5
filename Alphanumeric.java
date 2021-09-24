package geekster;
import java.util.*;

public class Alphanumeric {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		sc.close();
		alphanumeric(str);
		
	}
	public static void alphanumeric(String str) {
		char []ar=str.toCharArray();
		int c=0;
		int n=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>='a' && ar[i]<='z' || ar[i]>='A' && ar[i]<='Z') {
				c=1;
			}
			if(ar[i]>='0' && ar[i]<='9') {
				n=1;
			}
		}
		if(n==1 && c==1) {
			System.out.println("String is Alphanumeric");
		}
		else {
		    System.out.println("String is not Alphanumeric");
		}
	}

}
