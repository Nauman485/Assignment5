package geekster;

public class Prime {
	
	public static void main(String []args) {
		
		for(int i=15;i<=80;i++) {
			{
				if(isprime(i)) {
					System.out.println(i+" ");
				}
			}
			
		}
	}
	
	public static boolean isprime(int n) {
		boolean flag=true;
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0){
			  flag=false;
			  break;
			}
		}
		if(flag) {
		return true;
		}
		else {
			return false;
		}
	}

}
