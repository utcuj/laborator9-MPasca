
public class ClasaA {
	private int a;
	public ClasaA(int a) {
		this.a = a;
	}
	
	public void isEven(int a) throws Exceptie1{
		if(a % 2 == 0) {
			System.out.println("The number " + a + " is even");
		}
		else {
			throw new Exceptie1("The number " + a + " is odd!");
		}
	}

	public int getA() {
		return a;
	}

}
