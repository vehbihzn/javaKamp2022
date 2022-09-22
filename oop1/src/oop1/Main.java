package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setImageUrl("bilmemne.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(8);
		product2.setUnitInStock(32);
		product2.setImageUrl("bilmemne2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(9);
		product3.setUnitInStock(55);
		product3.setImageUrl("bilmemne3.jpg");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
			
			IndividualCustomer individualCustomer = new IndividualCustomer();
			
			individualCustomer.setId(1);
			individualCustomer.setCustomerNumber("12345");
			individualCustomer.setPhone("055000");
			individualCustomer.setFirstName("Engin");
			individualCustomer.setLastName("Demiroð");
			
			
			
			CorporateCustomer corporateCustomer = new CorporateCustomer();
			corporateCustomer.setId(1);
			corporateCustomer.setPhone("65463553");
			corporateCustomer.setCompanyName("Kodlama.io");
			corporateCustomer.setTaxNumber("34532434");
			corporateCustomer.setCustomerNumber("64643");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
