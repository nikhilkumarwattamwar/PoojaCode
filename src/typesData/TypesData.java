package typesData;

public class TypesData {

	public static void main(String[] args) {
		byte b =127; //1 byte -8 bit    (-2^7 to 2^7) d-0
	    short s=128; //2byte -16 bit   (-2^15 to 2^15) d-0
	    int i=17;    //4 byte -32 bit  (-2^31 to 2^31) d-0
	    long l=5768979l ;//8byte -64bit   (-2^63 to 2^63) l at end d-0l

	    float f=5.6f;   //4 byte -32 bit (7 decimal)  f at end d-0.0f
	    double d=6.638735 ;//8byte -64bit d-0.0

	    char g='j'; //d-'\u0000'	null

	    boolean x=true;  //(true/false) d-false
	}

}
