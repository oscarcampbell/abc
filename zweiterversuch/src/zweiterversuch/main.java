package zweiterversuch;

public class main {

	public static void drucken(String c) {
		System.out.println(c + " <- Das ist ein String");
	}
	
	public static void main(String[] args) {
		
		
		int[] a = new int[10];
		
		for(int each : a) {
			each = (int)(Math.random()*1000000);
			System.out.println(each);
			main.drucken("--------------");
		}
		
	}
	
	
		//System.out.println("Zweiter Versuch");
	
}