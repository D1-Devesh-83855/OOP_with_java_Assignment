package tester;
import com.app.geometry.*;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(10,20);
		Point2D p2 = new Point2D(10,50);
		boolean checkpoint = Point2D.isEqual(p1, p2);
		if(checkpoint == true) {
			System.out.println("p1 and p2 are located at same distace");
			String deatails = p1.getDetails();
			System.out.println(deatails);
		}
		else {
			double totat = Point2D.calculateDistance(p1, p2);
			System.out.println(totat);
		}
		
		

	}

}
