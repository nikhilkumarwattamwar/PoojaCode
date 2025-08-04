package typesData;

public class Evenodd {
	public static void main(String[] args) {
		int i;
		for (i = 1; i < 15; i++)
			if (i % 2 == 0) {
				System.out.println(i + "is even");
			} else {
				System.out.println(i + "is odd");
			}
	}

}
