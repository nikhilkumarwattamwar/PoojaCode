package typesData;

public class Casting {

	public static void main(String[] args) {
		  //Type Promotion
		 byte a=10;
		 byte b=20;
		 int  c=a*b;
		 System.out.println(c);
//-------------------------------------------------------------------------------
		//implicit --usually works from small to large data type

		float d=12.43535f;
		double e=d;   
		System.out.println(e);
//----------------------------------------------------------------------------------
		//explicit may occur data loss-large to small
		int f=257;
		byte g=(byte)f;
		System.out.println(g);


	}

}
