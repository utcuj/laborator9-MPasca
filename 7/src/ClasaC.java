
public class ClasaC extends ClasaB{
	private int c;
	
	public ClasaC(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	
	public void isEven(int a, int b, int c) throws Exceptie1 {
		super.isEven(a, b);
		
		if(c % 2 == 0) {
			System.out.println("The number " + c + " is even");
		}
		else {
			throw new Exceptie3("The number " + c + " is odd");
		}
	}

	public int getC() {
		return c;
	}

}
