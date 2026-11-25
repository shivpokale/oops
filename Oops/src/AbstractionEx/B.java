package AbstractionEx;

public class B extends A {
	  private int y;	
	   B(int y){
	      super(10);	
	      System.out.println("Value of y: " +y);
	   }
	   void m1(int x, double y){
	       System.out.println("One");
	   }
	   void m2(){
	      System.out.println("Two"); 
	      this.m1(5, 10.50);
	   }

}
