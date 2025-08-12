package ExceptionHandling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
	 public InsufficientBalanceException(String msg){
		super(msg);
	}
	
}
public class WithDraw {

	public static void main(String[] args) {
		int Withdrawlimit=10000;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn :");
		int amount= scanner.nextInt();
		try {
			if(amount<=0) {
			System.out.println("Invalid Amount");
		}
			else if(amount<=Withdrawlimit)
				{
				System.out.println("Amount withdrawn :"+amount);
				}
			else 
			 {
				throw new InsufficientBalanceException("withdrawal limit=10000");
			}
		}
			
		catch(InsufficientBalanceException e){
			System.out.println(e.getMessage());
		}
		finally {
			scanner.close();
		}

	}

}

