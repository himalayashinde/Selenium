package Selenium.Refresher;

public class Variables {

	static int a= 100; // static variable
	
	public void method() {
		
		int b= 200; //local variable
		System.out.println("Local Variable b value: "+b);
	};
	
	public static void main(String[] args) {
		
		int c= 300; //instance variable
		Variables v= new Variables();
		
		System.out.println("Static Variable a value: "+ a);
		v.method();
		System.out.println("Instance Variable c value: "+c);
	}

}

/* Output

Static Variable a value: 100
Local Variable b value: 200
Instance Variable c value: 300

*/