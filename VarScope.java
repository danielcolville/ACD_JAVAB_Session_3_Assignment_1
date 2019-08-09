package session3;

public class VarScope {
	
	static int objCount=0;
	public int number;
	
	VarScope() {
		number=5;
		objCount++;
	}
	public static void main(String [] args) {
		//static variable is in scope anywher
		System.out.println("Static var equals: "+objCount);
		VarScope a=new VarScope();//instance variable only in scope after object created
		System.out.println("Instance variable after object created in main"+a.number);
		a.instMethod();
		cVarHidden();
		
	}
	public static void cVarHidden() {
		System.out.println("Instance not visible in static method");
		System.out.println("Static var in static method:"+objCount);
	}
	public void instMethod() {
		System.out.println("Static variable in instance method: "+ objCount);
		System.out.println("Instance variable in instance method: "+number);
	}
	
}
