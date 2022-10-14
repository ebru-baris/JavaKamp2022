package ikinciHaftaOdevler;

public class ClasessWithAttributes {

	public static void main(String[] args) {
		
	Product product = new Product(1,"Laptop","Asus Laptop",5000,3,"Gri");
		/*Product product = new Product();
		product.setName("Laptop"); //product.name ="Laptop";
		product.setId(1);          //product.id = 1;
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3); */
		
		
	    //product.renk="gri";
	    //System.out.println(product.name);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		

	}

}
