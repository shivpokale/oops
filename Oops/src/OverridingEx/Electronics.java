package OverridingEx;

public class Electronics extends Product {
	
	Electronics(int id ,double price, String name){
		super(id, price, name);
	}
	
	@Override
	double calculateDiscount() {
		return price*10/100;
	}

}
