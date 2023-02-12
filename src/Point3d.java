public class Point3d extends Point2d{
    //private double xCoord;
    //private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    public boolean equal(Point3d first) {
        //return first.equals(this);
        return this.xCoord == first.xCoord && this.yCoord == first.yCoord && this.zCoord == this.zCoord;
    }
    public double distanceTo(Point3d first) {
        return Math.sqrt(Math.pow(first.xCoord - this.xCoord, 2) + Math.pow(first.yCoord - this.yCoord, 2) + Math.pow(first.zCoord - this.zCoord, 2));
    }

    public void SetZ(double val) {
        zCoord = val;
    } 
    public double getZ() {
        return zCoord;
    }

}
