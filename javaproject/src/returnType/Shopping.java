package returnType;

public class Shopping {
	public static void main(String[] args) {
		
		Mall m=new Mall();
		
		Product p = m.getSingleProduct();
		System.out.println("Single Product Details:\n "+p.productId+
		" "+p.productName+ " "+p.price);
		
		AllProducts ap=m.getAllProducts();
		
		System.out.println("All products Details:\n" +ap.p1.productId+
				" "+ap.p1.productName+" "+ap.p1.price );
		System.out.println(ap.p2.productId+
				" "+ap.p2.productName+" "+ap.p2.price );
		System.out.println(ap.p3.productId+
				" "+ap.p3.productName+" "+ap.p3.price );
		
		
		
	}

}
