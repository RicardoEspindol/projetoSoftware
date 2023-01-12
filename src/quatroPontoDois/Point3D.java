package quatroPontoDois;

public class Point3D extends Point2D {
	private float z;
	
	public Point3D(float x, float y, float z) {
		super(x,y);
		this.z = z;
	}
	
	public Point3D() {
		super();
	}
	
	public float getZ() {
		return z;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x, float y, float z) {
		super.setXY(x, y);;
		this.z = z;
	}
	

	public float[] getXYZ() {
		float [] xyz = {0,0,0};

		xyz[0] = super.getX();
		xyz[1] = super.getY();
		xyz[2] = z;
		return this.getXYZ();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", z=" + z;
    }
}
