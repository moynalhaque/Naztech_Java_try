package polymorphism;

public class Calculator {
	public int add(int x, int y) {
		int z= (x+y);
		System.out.println("Integer Result 1 ="+z);
		return z;
	}
	public int add (int x, int y, int z) {
		int w = x+y+z;
		System.out.println("Integer Result 2 ="+w);
		return w;
	}
	
	public double add (double x, double y, double z) {
		double m = x+y+z;
		System.out.println("Integer Result 3 ="+m);
		return m;
	}

}
