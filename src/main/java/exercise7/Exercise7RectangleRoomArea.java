public class Exercise7RectangleRoomArea {

    private final static int CONVERSION_FACTOR = 9290304;

    public int areaInFeet(int length, int width) {
        int feetFormula = length * width;
        int totalAreaInFeet = feetFormula;


//        System.out.println("The length of the room is " + length);
//        System.out.println("The width of the room is " + width);
//        System.out.println("The area of the room is " + totalAreaInFeet + "feet");


        return totalAreaInFeet;

    }

    public int convertFeetToMetres(int totalAreaInFeet) {


        int conversion = totalAreaInFeet * CONVERSION_FACTOR;
        int totalAreaInMetres = conversion;


//        System.out.println(totalAreaInMetres + "metres");

        return totalAreaInMetres;

    }
}
