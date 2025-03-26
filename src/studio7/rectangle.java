package studio7;

public class rectangle {

	private double length;
	private double width;
	
	public rectangle() {
        length = 0;
        width = 0;
     }
	
	public rectangle (double length, double width) {
        this.length = length;
        this.width = width;
     }
	
	public double areaRectangle() {
		double area = length * width;
		return area;
		
	}
	public double perimeterRectangle () {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public void compare(rectangle other) {
		if (other.areaRectangle() > this.areaRectangle()) {
			System.out.println ("other is bigger than this");
		}else {
			System.out.println("this is bigger than other");
		}
		
	}
	
	public boolean square () {
		boolean isSquare = true;
		if (length == width) {
			return isSquare;
		}
		isSquare = false;
		return isSquare;
	}
	
	public static void main (String[] args) {
		rectangle r1 = new rectangle(1,2);
		rectangle r2 = new rectangle(3,2);
		
		r2.compare(r1);
		r1.compare(r2);

	}
}