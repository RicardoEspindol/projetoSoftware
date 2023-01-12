package umPontoTres;

public class Rectangle {
	
	private float length;
	private float width;
	
	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
		
	}

	public Rectangle(float l, float w) {
		this.length = l;
		this.width = w;
	}
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public String toString() {
		   return "Rectangle[length=" + length + " width=" + width + "]";
		}
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return (length*2) + (width*2);
	}
	
	
}
