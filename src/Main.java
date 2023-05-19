public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();

        System.out.println(point2D);
        System.out.println(point3D);

        System.out.println(point2D.getXY());
        System.out.println(point3D.getXYZ());

        point2D.setXY(1,2);
        printArr(point2D.getXY());
        point3D.setXYZ(3,4, 5);
        printArr(point3D.getXYZ());

    }
    public static void printArr(float[] arr){
        for(float element : arr){
            System.out.printf("%f ", element);
        }
        System.out.printf("\n");
    }
}
