package ilkHaftaOdevler;

public class LoopDemo {

	public static void main(String[] args) {
//		For
		for (int i=1;i<10;i++) {
//	tek sayı seklinde arttirmak istersek i+2 yazmalıyız
		System.out.println(i);	
		}
		System.out.println("Dongu Bitti");
		
		
		//While
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
//		infinite loop
		System.out.println("While Dongusu Bitti");
		
		// "While ve Do-While farki, Do-while sartı saglamasa bile bir kez çalisir
		
		// Do-While
		int j=11;
		do {
			System.out.println(j);
			j+=2;	
		} while(j<10);
		System.out.println("Do-While Dongusu Bitti");

	}

}
