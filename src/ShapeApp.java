public class ShapeApp {

    public static void main(String[] args) {

        var shape = new Shape();
        System.out.println(shape.getCorner());

        var retangle = new Rectangle();
        System.out.println(retangle.getCorner());
        System.out.println(retangle.getParentCorner());
    }
}
