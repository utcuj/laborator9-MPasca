
public class ClasaB extends ClasaA{
	private int b;
	
	public ClasaB(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public void isEven(int a, int b) throws Exceptie1{
		super.isEven(a);
		
		if(b % 2 == 0) {
			System.out.println("The number " + b + " is even");
		}
		else {
			throw new Exceptie2("The number " + b +" is odd");
		}
	}
	
	public int getB() {
		return this.b;
	}
}
