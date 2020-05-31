
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = Triangle.factoryIsosceles(2, 3);
		Triangle t2 = Triangle.factoryEquilateral(2);
		System.out.println(Triangle.getCircuit(t1));
		System.out.println(Triangle.getContent(t1));
		System.out.println(Triangle.getCircuit(t2));
		System.out.println(Triangle.getContent(t2));
	}


}
