package csclab.tw;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double result;
		result = radius*radius*Math.PI;
		
		return result;
	}

}
