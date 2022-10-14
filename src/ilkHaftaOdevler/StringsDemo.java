package ilkHaftaOdevler;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "     Bugun hava cok guzel.     ";
		System.out.println(mesaj);
	/*System.out.println("Eleman sayisi : " +mesaj.length());
	System.out.println("5. Eleman : " + mesaj.charAt(4));
	System.out.println(mesaj.concat("Yasasin!"));
	System.out.println(mesaj.startsWith("B"));
	System.out.println(mesaj.endsWith("."));
	char[] karakterler = new char[5];
	mesaj.getChars(0,5, karakterler, 0); // srcBegin:0, srcEnd:5,dstBegin:0
	System.out.println(karakterler);
	System.out.println(mesaj.indexOf("av"));
	System.out.println(mesaj.lastIndexOf("e"));*/
	
	String yeniMesaj = mesaj.replace(' ', '-');
	System.out.println(yeniMesaj);
	//System.out.println(mesaj.replace(' ', '-'));
	System.out.println(mesaj);
	System.out.println(mesaj.substring(2)); //metinden parca almak
	System.out.println(mesaj.substring(2,4)); // 4e kadar
	
	for (String kelime : mesaj.split(" ")) {
		System.out.println(kelime);
	  }
	System.out.println(mesaj.toLowerCase());// hepsi kucuk harf
	System.out.println(mesaj.toUpperCase()); // hepsi buyuk harf
	System.out.println(mesaj.trim()); //basta ve sonda olan bosluklari siler
	
	
	
	
	}

}
