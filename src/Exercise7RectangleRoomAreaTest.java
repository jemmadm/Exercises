import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;


public class Exercise7RectangleRoomAreaTest {


    @Test
    public void noValuesForFeet() {

    }

    @Test
    public void noValuesForArea() {
        Exercise7RectangleRoomArea exercise7RectangleRoomArea = new Exercise7RectangleRoomArea();
        assertThat(exercise7RectangleRoomArea.convertFeetToMetres(0));

    }

    @Test
    public void doesAreaInFeetWork() {
        Exercise7RectangleRoomArea exercise7RectangleRoomArea = new Exercise7RectangleRoomArea();
        assertThat(exercise7RectangleRoomArea.areaInFeet(15, 20));

    }

    @Test
    public void doesAreaInMetresWork() {
        Exercise7RectangleRoomArea exercise7RectangleRoomArea = new Exercise7RectangleRoomArea();
        assertThat(exercise7RectangleRoomArea.convertFeetToMetres(300));
    }

}