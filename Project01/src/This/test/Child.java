package This.test;

public class Child extends Parent {
	int x=25;
	
	void test() {
		int x=30;
		Child obj =new Child();
		this.test2();
		
		System.out.println("by creating object>>"+ obj.x);
		
		System.out.println("by using this keyword>>"+this.x);
	}
	

}
