package ikinciHaftaOdevler;

public class Methods {

	public static void main(String[] args) {
	sayiBulmaca();
	}
	
	//camel casing
   public static void sayiBulmaca() {
			   int[] sayilar = new int[] {1,2,5,7,9,0};
			   int aranacak = 6;
			   boolean varMi= false;
			   
			   for(int sayi : sayilar) {
				   if(sayi==aranacak) {
					   varMi = true;
					   break;
				   }
			   }
			   
			   if(varMi) {
				  //System.out.println("Sayi mevcuttur:" + aranacak);
				   mesajVer(7); //mesajVer(aranacak);
			   }else {
				   System.out.println("Sayi mevcut degildir:"+ aranacak);
			   }

	}
     public static void mesajVer(int aranacak) {
    	 System.out.println("Sayi mevcuttur:" + aranacak);
	 
 }

}
