package ilkHaftaOdevler;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		// 1 olması bug(böcek- hata)
	 int number = 1;
	 int remainder = number % 2; //kalan
	 System.out.println(remainder);
	 boolean isPrime = true;
	 
	 if(number==1) {
		System.out.println("Sayi asal degildir");
		return;
	 }
	 
	 if(number<1) {
		 System.out.println("Gecersiz sayi");
		 return;
	 }
	 
	 for(int i=2; i<number;i++) {
		if(number%2 == 0) {
			isPrime = false;
		}
	 }
	 
	if(isPrime) { // isPrime== true
		System.out.println("Sayi asaldir");
	} else {
		System.out.println("Sayi asal degildir");
	 }

	}

}
