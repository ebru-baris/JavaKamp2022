package ucuncuHaftaOdevlerDevam.ders45;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator();
	//	if(validator.isValid(product)) {
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Urun bilgileri gecersizdir");
		}
		
	}

}
