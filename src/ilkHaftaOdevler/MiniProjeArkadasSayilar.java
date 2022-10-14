package ilkHaftaOdevler;

public class MiniProjeArkadasSayilar {

	public static void main(String[] args) {
		int sayi1 =220;
		int sayi2 =284;
		int toplam1 =0;
		int toplam2 =0;
		
		for(int i=1 ; i<sayi1; i++) {
			if(sayi1%i==0) {
				toplam1 = toplam1+i;
			}
			
		}
		
		for(int i=1; i<sayi2; i++) {
			if(sayi2%i==0) {
				toplam2 = toplam2+i;
			}
		}
		 
		if(sayi1==toplam2) {
			System.out.println("Mukemmel sayidir");
		}else {
			System.out.println("Mukemmel sayi degildir");
		}
		

	}

}
