package doisPontoSeis;

public class MyPoint {
	private int x = 0;
	private int y = 0;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public MyPoint() {
	}

	@Override
	public String toString() {
		return  "("+ x + ", " + y+")";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] xy = {0,0};
		
		xy[0] = x;
		xy[1] = y;
		
		return xy;
	}
	public void setXY(int x,int y) {
		this.x = x;
		this.y =y;
	}
	
	public double distance(int x, int y) {
		   int xDiff = this.x - x;;
		   int yDiff = this.y - y;
		   return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		}
	
	public double distance(MyPoint m) {
		   int xDiff = this.x -  m.x;
		   int yDiff = this.y -  m.y;
		   return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		}
	public double distance() {
		return distance(0,0);
	}
	
}
