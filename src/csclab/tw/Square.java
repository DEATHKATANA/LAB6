package csclab.tw;

public class Square extends Shape {
	
	private double side;
	
	public Square(double side){
		this.side = side;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double result;
		
		result = side*side;
		return result;
	}

}
