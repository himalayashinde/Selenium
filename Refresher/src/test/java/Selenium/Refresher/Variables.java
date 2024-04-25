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
		/*###################################################################*/
		
		System.out.println("Static Variable a value: "+ a);
		v.method();
		System.out.println("Instance Variable c value: "+c);

		/*###################################################################*/	
		
		//Add two numbers
		
		int x=10, y=20, z=x+y;
		System.out.println("Sum :"+ z);
		
		/*###################################################################*/
		
		//Widening
		
		float f =x;
		System.out.println("Widening: "+ f);
		
		/*###################################################################*/
		
		//Narrowing or typecasting
		float fl= 10.5f;
		int d= (int)fl;
		
		System.out.println("Float: "+fl);
		System.out.println("Typecasted Int : "+d);
		
		/*###################################################################*/
		
		//Overflow
		int e=130;
		byte g= (byte)e;
		System.out.println("Int: "+ e+ " OverFlow :"+ g);
		
		/*###################################################################*/
		
		//Adding Lower Types
		
		byte ab=20, bc= 20;
		byte cd= (byte) (ab+bc);
		System.out.println("Adding lower types : "+ cd);
		
		/*###################################################################*/
		
		
		
		
	}

}

/* Output

Static Variable a value: 100
Local Variable b value: 200
Instance Variable c value: 300

*/