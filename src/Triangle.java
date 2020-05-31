
public class Triangle {
	double sideA, sideB, sideC;

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}
	public static double getContent(Triangle t) {
		double s = (t.getSideA()+t.getSideB()+t.getSideC())/2;
		return Math.sqrt(s*(s-t.getSideA())*(s-t.getSideB())*(s-t.getSideC()));
	}
	public static double getCircuit(Triangle t) {
		return t.getSideA()+t.getSideB()+t.getSideC();
	}
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public static Triangle factoryEquilateral(double a) {
		return new Triangle(a,a,a);
	}
	public static Triangle factoryIsosceles(double a, double b) {
		return new Triangle(a,a,b);
	}
	
}
