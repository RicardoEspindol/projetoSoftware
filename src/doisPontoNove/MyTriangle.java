package doisPontoNove;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	@Override
	
	public String toString() {
		return "MyTriangle [v1=" + v1.getXY() + ", v2=" + v2.getXY() + ", v3=" + v3.getXY() + "]";
	}
	public MyTriangle(int x1, int y1, int x2, int y2,int x3, int y3) {
		this.v1.setX(x1);
		this.v1.setY(y1);
		this.v2.setX(x2);
		this.v2.setY(y2);
		this.v3.setX(x3);
		this.v3.setY(y3);
		
	}
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public double getPerimeter(MyPoint m) {
		return m.distance();
	}
	public String getType(MyTriangle m) {
		if(m.getV1().getX() == m.getV1().getY()) {
			return "escaleno";
		}
		return null;
	}
	public MyPoint getV1() {
		return v1;
	}
	public void setV1(MyPoint v1) {
		this.v1 = v1;
	}
	public MyPoint getV2() {
		return v2;
	}
	public void setV2(MyPoint v2) {
		this.v2 = v2;
	}
	public MyPoint getV3() {
		return v3;
	}
	public void setV3(MyPoint v3) {
		this.v3 = v3;
	}
}
//INCOMPLETE ==========================================
