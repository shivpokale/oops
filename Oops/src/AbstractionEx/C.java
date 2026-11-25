package AbstractionEx;

public class C extends B {
		  C(){
		    super(30);	 
		  }
		  void m1(int x, double y){
		      super.m1(10, 15.15);
		      System.out.println("Three"); 
		  }

}
