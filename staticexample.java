public class staticexample { 
	// static variable 
	static int a = 40; 

	// instance variable 
	int b = 50; 

	void simpleDisplay(int a) 
	{ 
            System.out.println(a);
            staticexample.a=a;
		System.out.println(a); 
		System.out.println(b); 
	} 

	// Declaration of a static method. 
	static void staticDisplay() 
	{ 
	System.out.println(a); 
    
	} 

	// main method 
	public static void main(String[] args) 
	{ 
            staticexample obj = new staticexample(); 
		obj.simpleDisplay(20); 
		staticexample.a=100;

		// Calling static method.
             
		staticDisplay(); 
	} 
}


