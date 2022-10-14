package ucuncuHaftaOdevlerDevam.ders45;

public class ProductValidator {
	
	static {
		System.out.println("Static Yapici blok calisti");
	}
	public ProductValidator() {
		System.out.println("Yapici blok calisti");
	}
	
	
	public static boolean isValid (Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void bisey() {
		
	}
	
	public static class BaskaBirClass{
		public static void Sil() {
			
		}//inner class
	}

}
