import java.util.Scanner;
public class Rectangle
{
	double width=1.0,height=1.0;
	void rectangle()  //创建默认矩形的无参构造方法。
	{
		
	}
	void rectangle(double _width,double _height)  //(3)一个创建width和height为指定值的矩形的构造方法。
	{
		width =_width;
		height = _height;
	}
	double getArea() //一个名为getArea()的方法返回这个矩形的面积。
	{
		return width*height;
	}
	double getPerimeter() //一个名为getPerimeter()的方法返回周长。
	{
		return 2*(width+height);
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Rectangle rectangle1 = new Rectangle();
		rectangle1.rectangle();
		System.out.println("默认的宽为:"+rectangle1.width+" 默认的高为:"+rectangle1.height);
		System.out.println("默认的面积为:"+rectangle1.getArea()+" 默认的周长为:"+rectangle1.getPerimeter());
		double widthq = input.nextDouble();
		double heightq = input.nextDouble();
		rectangle1.rectangle(widthq,heightq);
		System.out.println("修改后的宽为:"+rectangle1.width+" 修改后的高为:"+rectangle1.height);
		System.out.println("修改后的面积为:"+rectangle1.getArea()+" 修改后的周长为:"+rectangle1.getPerimeter());
		
	}
	
}