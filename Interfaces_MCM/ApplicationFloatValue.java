
public class ApplicationFloatValue {

	public static void main(String[] args) {
		 RationalNumber r1 = new RationalNumber(6, 8);
	        RationalNumber r2 = new RationalNumber(1, 3);
	        RationalNumber r3, r4, r5, r6, r7;
	        
	 
	        System.out.println("First rational number: " + r1);
	        System.out.println("Second rational number: " + r2);


	        r3 = r1.reciprocal();
	   
	        r4 = r1.add(r2);
	        r5 = r1.subtract(r2);
	        r6 = r1.multiply(r2);
	        r7 = r1.divide(r2);
	        
	        System.out.println(r1.conversion());
	        System.out.println(r2.conversion());
	        System.out.println(r3.conversion());
	        System.out.println(r4.conversion());
	        System.out.println(r6.conversion());
	        
	        double comparison1 = r1.compareTo(r6);
	        if (comparison1 == 0) {
	            System.out.println("r1 and r6 are equal.");
	        } else if (comparison1 < 0) {
	            System.out.println("r1 is less than r6.");
	        } else {
	            System.out.println("r1 is greater than r6.");
	        }
	        
	        double comparison2 = r2.compareTo(r3);
	        if (comparison2 == 0) {
	            System.out.println("r2 and r3 are equal.");
	        } else if (comparison2 < 0) {
	            System.out.println("r2 is less than r3.");
	        } else {
	            System.out.println("r2 is greater than r3.");
	        }
	        
	        
	        double comparison3 = r4.compareTo(r6);
	        if (comparison3 == 0) {
	            System.out.println("r4 and r6 are equal.");
	        } else if (comparison3 < 0) {
	            System.out.println("r4 is less than r6.");
	        } else {
	            System.out.println("r4 is greater than r6.");
	        }
	        
	        double comparison4 = r1.compareTo(r2);
	        if (comparison4 == 0) {
	            System.out.println("r1 and r2 are equal.");
	        } else if (comparison4 < 0) {
	            System.out.println("r1 is less than r2.");
	        } else {
	            System.out.println("r1 is greater than r2.");
	        } 
	        
	}//end main

}//end class
