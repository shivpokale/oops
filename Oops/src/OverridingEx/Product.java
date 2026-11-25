package OverridingEx;

public class Product {
	
	int id;
	double price;
	String name;
	
	Product(int id ,double price, String name){
		this.id=id;
		this.price=price;
		this.name=name;
	}
	
	double calculateDiscount() {
		return price*5/100;
	}
	public void displayDetails() {
		System.out.println("Product ID: "+ id);
		System.out.println("Product name: "+ name);
		System.out.println("Product price: "+ price);
		System.out.println("Product discount: "+ calculateDiscount());
		System.out.println("Final price: "+ (price-calculateDiscount()));
	}

}
