package point;

public class Point3D extends Point2D {
    private float z= 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }
    public double[] getXYZ(){
        return new double[]{getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")";
    }
}
