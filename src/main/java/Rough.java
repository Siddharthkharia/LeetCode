import java.util.Scanner;

public class Rough {
	
	
	public class CreditCardAccount{
		long CreditNumber;
		String Name;
		float Outstanding;
	}

	public boolean RiskyAccount(CreditCardAccount account) {
		
		if(account.Outstanding>=75000) {
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []  arr = new int[10];
		
		int [] a = new int [10+5];
		
		a[12]=10;
		System.out.println(a[12]);
		
		arr[10]=9;
		System.out.println(arr[10]);
		
		Scanner sc = new Scanner(System.in);
		

	}

}
