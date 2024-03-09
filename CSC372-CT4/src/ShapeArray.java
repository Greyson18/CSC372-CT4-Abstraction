public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];

        shapeArray[0] = new Sphere(3.5);
        shapeArray[1] = new Cylinder(3.0, 10.5);
        shapeArray[2] = new Cone(2.0, 8.0);

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}