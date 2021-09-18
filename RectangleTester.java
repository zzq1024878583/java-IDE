import java.awt.Rectangle;

public class RectangleTester {

	public static void main(String[] args)	{

		Rectangle r1 = new Rectangle(0, 0, 100, 50);
		Rectangle r2 = new Rectangle(10,22,100,50);
		r2 = r1;

		/* Your code goes here */

		System.out.println(r1);
		System.out.println(r2);
		/* and here */

	}
	
}