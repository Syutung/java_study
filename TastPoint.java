import java.util.Scanner;


public class TastPoint
{
	double x,y;
	private static Scanner input;
	void setX(double _x)
	{
		x=_x;
	}
	void setY(double _y)
	{
		y=_y;
	}
	void point()
	{
		x=6.56;
		y=8.78;
	}
	void point(double _x,double _y)
	{
		x=_x;
		y=_y;
	}
	void getDistanceToBase()
	{
		System.out.println("到原点的距离是："+Math.sqrt(x*x + y*y));
	}
	public static void main(String[] args)
	{
		TastPoint p1 = new TastPoint();
		input = new Scanner(System.in);
		p1.point();
		p1.getDistanceToBase();
		
		TastPoint p2 = new TastPoint();
		double x1= input.nextDouble();
		double y1= input.nextDouble();
		p2.setX(x1);
		p2.setY(y1);
		p2.getDistanceToBase();
		
		p2.point(x1, y1);
		p2.getDistanceToBase();
	}

}