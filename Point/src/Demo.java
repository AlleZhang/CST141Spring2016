
public class Demo {

	public static void main(String[] args) {
		Point point1 = new Point(2, 5);
		Point point2 = new Point(point1);
		Point point3 = point2.deepCopy();
		Point point4 = point1.shallowCopy();
		
		Point point5 = point1.deepCopy(point1);
		Point point6 = point2.shallowCopy(point2);
		
		System.out.println(point3);
		System.out.println(point4);
		point1.setX(100);
		point2.setX(200);
		System.out.println(point1);
		System.out.println(point5);
		System.out.println(point2);
		System.out.println(point6);
	}

}
