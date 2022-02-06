// Write a program with enum constants as switch case values.

enum GeoShape {
    TRIANGLE, SQUARE, RECTANGLE;
}

class EnumGeoShape {

    public void property(GeoShape gsh) {
        switch (gsh) {
            case TRIANGLE:
                System.out.println("This is a triangle.");
            case SQUARE:
                System.out.println("This is a square.");
            case RECTANGLE:
                System.out.println("This is a rectangle.");
        }
    }
}

public class EnumExSwitch {
    public static void main(String args[]) {
        EnumGeoShape e = new EnumGeoShape();
        e.property(GeoShape.SQUARE);
    }
}