package ExceptionHandling;

import java.util.Scanner;

class TooOldException extends Exception{
	TooOldException(String msg){
		super(msg);
	}
}
class TooYoungException extends Exception{
	TooYoungException(String msg){
		super(msg);
	}
}
public class Dating {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");

		int age=scanner.nextInt();
		
		try {
			if(age>60) {
				throw new TooOldException("too old to date");
			}
			else if(age<14) {
				throw new TooYoungException("Wait and study");
			}
			else {
				System.out.println("Welcome to Dating site");
			}
		}
		catch(TooOldException|TooYoungException e) {
			System.out.println(e.getMessage());
			}
		finally {
			scanner.close();
		}
		
		}
	}
