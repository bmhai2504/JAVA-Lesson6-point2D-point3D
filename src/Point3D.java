public class Point3D extends  Point2D{
    private float z;

    public Point3D(){
        z = 0.0f;
    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }
    public float[] getXYZ(){
        float[] arrPoint3D = new float[3];
        arrPoint3D[0] = getX();
        arrPoint3D[1] = getY();
        arrPoint3D[2] = getZ();
        return arrPoint3D;
    }

    @Override
    public String toString() {
        return "(x = " + getX() + ", y = " + getY() + ", z = " + this.z + ")";
    }
}
