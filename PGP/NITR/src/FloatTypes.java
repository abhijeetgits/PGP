
public class FloatTypes {

	public static void main(String[] args) {
		//float sal = 2500.5; //Type mismatch: cannot convert from double to float
		//float sal = 2500.5f;
		//float sal = 2500.5F;
		float sal = (float)2500.5;
		System.out.println("My Salary = "+ sal);
		
		double n = 2500.5;
		System.out.println(n);
		
		byte b = (byte)130;
		System.out.println(b);
		
		System.out.println(Integer.toHexString(65));
		n=0x41;
		System.out.println(n);
	}
}
