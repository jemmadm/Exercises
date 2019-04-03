package Exercise9;

public class Exercise9PaintCalculator {
    private final static double CONVERSION_FACTOR = 0.002857142857143;

    public String paintNeededForRectangularRoom(double width, double length) {
        if (length * width % 350 == 0) {
            return "" + (int) (length * width / 350) + " gallons of paint needed";}
        else return  (int)Math.ceil(length * width * CONVERSION_FACTOR) + " gallons of paint needed";
    }

    public String paintNeededForRoundRoom(double radius) {
        return "" + (int) (radius*radius);
    }
}


