package sesssion3;

public class VarScope {
	
	static int objCount=0;
	public int number;
	
	VarScope() {
		number=5;
		objCount++;
	}
	public static void main(String [] args) {
		System.out.println(objCount);
		VarScope a=new VarScope();
		System.out.println(a.number);
		a.classMethod();
		
	}
	public static void cVarHidden() {
		//System.out.println(a.number);
		System.out.println(objCount);
	}
	public void classMethod() {
		System.out.println(objCount);
		System.out.println(number);
	}
	
}
