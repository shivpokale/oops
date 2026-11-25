package OverridingEx;

public class Clothing extends Product {
	
	Clothing(int id, double price,String name){
		super(id, price, name);
	}
	
	@Override
	double calculateDiscount() {
		return price*10/100;
	}
	
	

}
