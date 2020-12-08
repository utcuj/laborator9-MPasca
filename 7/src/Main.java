
public class Main {
	public static void main (String [] args) {
		ClasaC x = new ClasaC(4, 0, 1);
		
		try {
			x.isEven(x.getA(), x.getB(), x.getC());
		}catch(Exceptie1 e) {
			System.out.println(e.getMessage());
		}
	}
}
