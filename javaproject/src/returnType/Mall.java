package returnType;

public class Mall {
	
	Product getSingleProduct(){
		
		Product p = new Product();
		p.productId=675688;
		p.productName="Mobile";
		p.price=99999;
	
		return p;
	}
	
	AllProducts getAllProducts() {
		
		AllProducts ap = new AllProducts();
		ap.p1.productId=765427;
		ap.p1.productName="Charger";
		ap.p1.price=2000;
		
		ap.p2.productId=38733;
		ap.p2.productName="Mobile Case";
		ap.p2.price=400;
		
		ap.p3.productId=873824792;
		ap.p3.productName="Power Bank";
		ap.p3.price=4000;
		
		return ap;
		
	}

}
